package com.java.polymorphism;

public class Car {

    private String name;
    private int wheels;
    private boolean engine;
    private int cylinders;

    public Car(int cylinders, String name) {
        this.name = name;
        this.wheels = 4;
        this.engine = true;
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return getClass().getSimpleName() + " -> brake()";
    }

}
