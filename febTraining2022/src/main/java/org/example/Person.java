package org.example;

public class Person {
    private String name;
    private Language motherTongue;


    private String language;

    public Person() {
    }

/*    public Person(String name, Language motherTongue){
        this.name = name;
        this.motherTongue = motherTongue;
    }*/

/*    public Person(String name){
        this.name = name;
    }*/

    public void greet(){
/*        if(language.equals("hindi")) {
            Hindi hindi = new Hindi();
            hindi.sayHello(this.name);
        } else if(language.equals("english")){
            English english = new English();
            english.sayHello(this.name);
        }*/
        motherTongue.sayHello(this.name);
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

    public void setMotherTongue(Language motherTongue) {
        this.motherTongue = motherTongue;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

}
