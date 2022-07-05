package com.java.polymorphism;

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<=10; i++) {
            Car car = myCar();
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.brake());
        }

//        Car car = new Car(4, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(4, "Base car");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Holden holden = new Holden(4, "Base car");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
//
//        Ford ford = new Ford(4, "Base car");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());

    }

    public static Car myCar() {

        int choice = (int) (Math.random() * 3) + 1;
        System.out.println(choice);
        return switch (choice) {
            case 1 -> new Mitsubishi(4, "Mitsubishi");
            case 2 -> new Holden(12, "Holden");
            case 3 -> new Ford(8, "Ford");
            default -> null;
        };

    }

}
