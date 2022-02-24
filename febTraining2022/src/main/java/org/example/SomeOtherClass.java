package org.example;

public class SomeOtherClass {

    public void someOtherMethodWhichDealsWithPerson(){
        Person person = new Person();
        person.setName("Shishir");
        person.setMotherTongue(new Hindi());
        person.setLanguage("hindi");
        person.greet();
    }
}
