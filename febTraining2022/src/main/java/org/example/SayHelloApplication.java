package org.example;

public class SayHelloApplication {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Manish");
        person.setMotherTongue(new French());
        person.setLanguage("english");
        person.greet();
    }
}
