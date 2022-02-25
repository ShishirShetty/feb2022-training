package org.example.db;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.h2.command.Prepared;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReaderApp {

        // JDBC driver name and database URL
        //static final String JDBC_DRIVER = "org.h2.Driver";
        static final String DB_URL = "jdbc:h2:tcp://localhost/~/febTraining2022";

        //  Database credentials
        static final String USER = "sa";
        static final String PASS = "sa";

        public static void main2(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try {
                conn = getConnection();

                // STEP 3: Execute a query
                System.out.println("Connected database successfully...");
                stmt = conn.createStatement();
                String sql = "SELECT * FROM TESTDB.EMPLOYEE";
                ResultSet rs = stmt.executeQuery(sql);

                // STEP 4: Extract data from result set
                List<Employee> employees = new ArrayList<>();
                while(rs.next()) {
                    // Retrieve by column name
                    int id  = rs.getInt("id");
                    int age = rs.getInt("age");
                    String name = rs.getString("name");
                    String dept = rs.getString("dept");

                    employees.add(new Employee(name, dept, id, age));
                }

                File file = new File("D:\\shishir\\Data\\employees2.txt");
                FileWriter fileWriter = new FileWriter(file);
                try(BufferedWriter bw = new BufferedWriter(fileWriter)) {
                    int i = 0;
                    for (Employee e : employees) {
                        System.out.println(e);
                        bw.write(Integer.toString(++i));
                        bw.write(" -> ");
                        bw.write(e.toString());
                        bw.write('\n');
                    }
                } //try-with-resources
               // FileUtils.writeLines(new File("D:\\shishir\\Data\\employees.txt"), employees );

                FileReader fileReader = new FileReader(file);
                try(BufferedReader br = new BufferedReader(fileReader)){
                    String line = null;
                    while((line = br.readLine()) != null)

                        System.out.println(line);
                }

                // STEP 5: Clean-up environment
                rs.close();
/*                try {
                    rs.close();
                } catch(SQLException e){

                }
                finally{
                    stmt.close();
                    conn.close();
                }*/

            } catch(SQLException se) {
                // Handle errors for JDBC
                se.printStackTrace();
            } catch(Exception e) {
                // Handle errors for Class.forName
                e.printStackTrace();
            } finally {
                // finally block used to close resources
                try {
                    if(stmt!=null) stmt.close();
                } catch(SQLException se2) {
                } // nothing we can do
                try {
                    if(conn!=null && !conn.isClosed())
                        conn.close();
                } catch(SQLException se) {
                    se.printStackTrace();
                } // end finally try
            } // end try
            System.out.println("Goodbye!");

        }

    private static Connection getConnection() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // STEP 2: Open a connection
        System.out.println("Connecting to database...");
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void main1(String[] args) throws SQLException, IOException {
        Connection connection = getConnection();
        String sql = "update testdb.employee set image = ? where id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setBlob(1, FileUtils.openInputStream(new File("D:\\shishir\\WS\\febTraining2022\\QualityGateCertificate.jpg")));
        pstmt.setInt(2, 2);
        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    public static void main(String[] args) throws SQLException, IOException {
        Connection connection  = getConnection();
        String sql = "select image from testdb.employee where id = ?";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setInt(1, 2);
        ResultSet rs =  pstmt.executeQuery();
        while(rs.next()){
            Blob image =  rs.getBlob("image");
            byte[] bytes = image.getBytes(1, (int)image.length());
            InputStream inputStream = new ByteArrayInputStream(bytes);
            OutputStream outputStream = new FileOutputStream(new File("D:\\shishir\\WS\\febTraining2022\\JohnsPhoto.jpg"));
            copy(inputStream, outputStream);
            inputStream.close();
            outputStream.close();
        }
        rs.close();
        connection.close();
    }

    public static void copy(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[4096];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    }

}
