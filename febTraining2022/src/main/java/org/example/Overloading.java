package org.example;

public class Overloading {

    public static void main(String[] args) {
       whatIsMyType(10);
    }

    public static void whatIsMyType(int i){
        System.out.println("I am primitive int");
    }

/*    public static void whatIsMyType(long i){
        System.out.println("I am primitive long");
    }

    public static void whatIsMyType(Integer i){
        System.out.println("I am wrapper int");
    }*/

    public static void whatIsMyType(Long i){
        System.out.println("I am wrapper long");
    }

}


