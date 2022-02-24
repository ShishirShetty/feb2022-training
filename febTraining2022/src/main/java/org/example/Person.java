package org.example;

import org.apache.commons.lang3.StringUtils;

public class Person {
    public static int personCounter = 0;
    String name;
    private Language motherTongue;
    private String address;

    {
        this.name = "";
    }

    private String language;

    public Person() {
       incrementCounter();
    }

    public Person(String name, Language motherTongue){
        this.motherTongue = motherTongue;
    }


/*    public Person(String name){
        this.name = name;
    }*/

    public final void greet(){
/*        if(language.equals("hindi")) {
            Hindi hindi = new Hindi();
            hindi.sayHello(this.name);
        } else if(language.equals("english")){
            English english = new English();
            english.sayHello(this.name);
        }*/
        motherTongue.sayHello(this.name);
    }

    public final void getAddress(){
        System.out.println(((IndianLanguage)motherTongue).getRegion());
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
            this.name = name;
    }

    public Language getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(final Language language) {
        this.motherTongue = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public static int incrementCounter(){
        return ++personCounter;
    }
}
