package org.example;

// public private protected <default>

//parent-child relationship is called IS-A relationship
//if there is even 1 abstract method in the class then the class has to be abstract
//if the class is abstract u may hv 0 or more abstract methods
public abstract class Vehicle {
    private int noOfWheels;
}

class Bicycle extends Vehicle{
    private String handle;
    private String color;

    void move() {
        System.out.println("I need to pedal");
    }
}

class MotorVehicle extends Vehicle{
    String typeOfMotor;

    void move() {
        System.out.println("I need turn on the motor and release the clutch");
    }
}

//HAS-A relationship
class Book{
    Author author;
    String name;
}

class Author{
    String name;
    Book[] books;
}

class Bird{

}