package org.example;

public class Car {
    String company;
    String name;
    public Car(String name, String company) {
        this.name = name;
        this.company = company;
    }
    public String getName() {
        return name;
    }
    public String getCompany() {
        return company;
    }
}
