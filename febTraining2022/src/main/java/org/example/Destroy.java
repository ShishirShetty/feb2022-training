package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Destroy {
    public static void main(String[] args) throws InterruptedException {
        Address a = new Address();
        a.setCity("Mumbai");
        a.setCountry("India");
        Employee e = new Employee(1, "Manish", a);

        System.out.println(e.getAddress().getCity());

        e.getAddress().setCity("Delhi");

        System.out.println(e.getAddress().getCity());

    }
}


final class Employee {
    private final int employeeId;
    private final String name;
    private Date dob;

    public Employee(int employeeId, String name, Address address) {
        this.employeeId = employeeId;
        this.name = name;
        Address local = new Address();
        local.setCity(address.getCity());
        local.setCountry(address.getCountry());
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        Address local = new Address();
        return local;
    }

}

class Address {
    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}