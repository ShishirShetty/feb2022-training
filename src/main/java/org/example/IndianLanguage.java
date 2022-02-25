package org.example;

public abstract class IndianLanguage extends Language {

    public IndianLanguage() {
    }

    public IndianLanguage(String name) {
        super(name);
    }

    public  String getRegion() {
        return "Delhi";
    }

}
