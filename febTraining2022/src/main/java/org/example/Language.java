package org.example;

public abstract class Language {
    private String name;
    private String attr1;
    private String attr2;
    private String attr3;
    private String attr4;


    public Language(){
//        super(); // if u add it explicitly, java compiler will add this line
        name = "";
        attr1 = "";
        //Constructor chaining
        // the first line of a constructor in any class should resolve into a call to Object class empty constructor
    }

    public Language(String name) {
        this();
        this.name = name;
    }

    public Language(String name, String attr1, String attr2, String attr3, String attr4) {
        super();
        this.name = name;
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.attr3 = attr3;
        this.attr4 = attr4;
    }

    public abstract void sayHello(String helloToWhom);

}
