package org.example;

public interface B {
    void print();

    default void display() {
        System.out.println(" I am C");
    }
}
