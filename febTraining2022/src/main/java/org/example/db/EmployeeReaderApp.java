package org.example.db;

import org.apache.commons.io.IOUtils;

import java.io.FileWriter;
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

        public static void main(String[] args) {
            Connection conn = null;
            Statement stmt = null;
            try {
                // STEP 1: Register JDBC driver
                Class.forName("org.h2.Driver");

                // STEP 2: Open a connection
                System.out.println("Connecting to database...");
                conn = DriverManager.getConnection(DB_URL,USER,PASS);

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

//                    employees[i] = new Employee(name, dept, id, age);
                    employees.add(new Employee(name, dept, id, age));
                }

                for(Employee e : employees){

                    System.out.println(e);
                }

                IOUtils.writeLines(employees, "\r\n", new FileWriter("D:\\shishir\\testFebTrainingDB.txt"));


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
                    if(conn!=null)
                        conn.close();
                } catch(SQLException se) {
                    se.printStackTrace();
                } // end finally try
            } // end try
            System.out.println("Goodbye!");
        }

}
