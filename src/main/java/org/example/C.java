package org.example;

public interface C {
    void print();
    default void display() {
        System.out.println(" I am C");
    }
}
