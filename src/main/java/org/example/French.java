package org.example;

public class French extends Language {
    @Override
    public void sayHello(String helloToWhom) {
        System.out.println("Bonjour "+ helloToWhom);
    }
}
