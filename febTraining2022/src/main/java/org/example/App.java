package org.example;


import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//        System.out.println(name.trim().equalsIgnoreCase("Manish"));
        sayHello("Manish");
        sayHello("Manish" , "AM");
        sayHello("Manish" , "PM");
        sayHello("Manish" , "");
        sayHello("Manish" , null);
    }

    public static void sayHello(String name) {
        System.out.println("Welcome " + name);
    }

    private static void sayHello(String name, String time) {
        if (StringUtils.equalsAnyIgnoreCase(time, "AM")) {
            System.out.println("Good Morning " + name);
        }
        else if (StringUtils.equalsAnyIgnoreCase(time, "PM")) {
            System.out.println("Good Evening " + name);
        }
        else {
            sayHello(name);
        }

    }

    public static int add(int a, int b, int c){
        return add(a, add(b,c));
    }

    public static int add(int a, int b){
        return a+b;
    }
}


