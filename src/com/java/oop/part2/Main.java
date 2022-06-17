package com.java.oop.part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //VipCustomer Class Object
        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
        System.out.println(vipCustomer.getEmailAddress());
        System.out.println();

        VipCustomer abhilash = new VipCustomer("Abhilash", 200000);
        System.out.println(abhilash.getName());
        System.out.println(abhilash.getCreditLimit());
        System.out.println(abhilash.getEmailAddress());
        System.out.println();

        VipCustomer bee = new VipCustomer("Bee", 500000, "bee@gmail.com");
        System.out.println(bee.getName());
        System.out.println(bee.getCreditLimit());
        System.out.println(bee.getEmailAddress());


        //Wall Class Object
        Scanner scan = new Scanner(System.in);
        Wall defaultConstructors = new Wall();
        System.out.println(defaultConstructors.getWidth());
        System.out.println(defaultConstructors.getHeight());
        System.out.println(defaultConstructors.getArea());
        System.out.print("Enter width and height: ");
        Wall wall = new Wall(scan.nextDouble(), scan.nextDouble());
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());

    }

}
