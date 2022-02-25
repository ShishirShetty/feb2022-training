package org.example;

public class Hindi extends IndianLanguage {

    public Hindi(){
        super("hindi");
        System.out.println("");
    }

    public Hindi(String name){
    }


    public String getRegion() {
        return "NCR";
    }


    @Override
    public void sayHello(String helloToWhom) {
        System.out.println("Pranaam " + helloToWhom);
    }
}
