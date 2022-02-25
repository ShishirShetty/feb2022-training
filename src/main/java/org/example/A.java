package org.example;

public class A extends D implements C,B {
        public static void main(String[] args) {
        C a  = new A();
        a.print();
    }


    @Override
    public void print() {

    }

    @Override
    public void display() {
        System.out.println("I am A");
    }


}
