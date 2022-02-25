package org.example;

public class SayHelloApplication {
    public static void main(String[] args) {
        System.out.println(Person.incrementCounter());

        int countOfPersonObjects = 0;

        Person person = new Person();
        person.setName("Manish");
        person.setMotherTongue(new French());
        person.setLanguage("French");
        person.greet();

        countOfPersonObjects = countOfPersonObjects + 1;

        Person person2 = new Person();
        person2.name = "Harini";
        person2.setName("Harini");
        person2.setMotherTongue(new English());
        person2.setLanguage("english");
        person2.greet();

        countOfPersonObjects = countOfPersonObjects + 1;

        SomeOtherClass s = new SomeOtherClass();
        s.someOtherMethodWhichDealsWithPerson();

        System.out.println("No. of person objects created today : " + Person.incrementCounter());


    }
}
