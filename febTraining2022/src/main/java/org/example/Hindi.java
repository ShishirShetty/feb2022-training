package org.example;

public class Hindi extends IndianLanguage {


    public Hindi(){
        super("hindi");
    }


    public String getRegion() {
        return "Delhi";
    }

    @Override
    public void sayHello(String helloToWhom) {
        System.out.println("Namaste " + helloToWhom);
    }
}
