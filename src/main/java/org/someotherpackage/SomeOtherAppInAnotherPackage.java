package org.someotherpackage;

import org.example.French;
import org.example.Person;

public class SomeOtherAppInAnotherPackage {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Manish");
        person.setMotherTongue(new French());
        person.setLanguage("French");
        person.greet();
    }
}
