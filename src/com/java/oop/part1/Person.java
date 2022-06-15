package com.java.oop.part1;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100)
            this.age = 0;
        else
            this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isTeen() {
        return this.age > 12 && this.age < 20;
    }

    public String getFullName() {
        if(lastName.isEmpty())
            return this.firstName;
        else if(firstName.isEmpty())
            return this.lastName;
        else
            return this.firstName + " " + this.lastName;
    }

}
