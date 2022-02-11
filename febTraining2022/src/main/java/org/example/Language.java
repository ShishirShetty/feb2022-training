package org.example;

public abstract class Language {
    private String name;

    public Language(){}

    public Language(String name) {
        this.name = name;
    }

    public abstract void sayHello(String helloToWhom);

}
