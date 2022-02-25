package org.example;

public class English extends Language {

    public English() {
        super("English");
    }

    public void sayHello(String helloToWhom) {
        System.out.println("Hello " + helloToWhom);
    }
}
