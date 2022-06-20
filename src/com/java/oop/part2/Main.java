package com.java.oop.part2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //VipCustomer Class Object

/*
Create a new class VipCustomer it should have 3 fields name, credit limit, and email address.
create 3 constructors
1st constructor empty should call the constructor with 3 parameters with default values
2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
3rd constructor should save all fields.
create getters only for this using code generation of intellij as setters wont be needed test and confirm it works.
 */

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


//================================================================================================================


        //Wall Class Object

/*
Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters width and height of type double and it needs to initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the height parameter is less than 0 it needs to set the height field value to 0.

Write the following methods (instance methods):
* Method named getWidth without any parameters, it needs to return the value of width field.
* Method named getHeight without any parameters, it needs to return the value of height field.
* Method named setWidth with one parameter of type double, it needs to set the value of the width field. If the parameter is less than 0 it needs to set the width field value to 0.
* Method named setHeight with one parameter of type double, it needs to set the value of the height field. If the parameter is less than 0 it needs to set the height field value to 0.
* Method named getArea without any parameters, it needs to return the area of the wall.


TEST EXAMPLE

→ TEST CODE:

1 Wall wall = new Wall(5,4);
2 System.out.println("area= " + wall.getArea());
3
4 wall.setHeight(-1.5);
5 System.out.println("width= " + wall.getWidth());
6 System.out.println("height= " + wall.getHeight());
7 System.out.println("area= " + wall.getArea());

→ OUTPUT:

area= 20.0
width= 5.0
height= 0.0
area= 0.0


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 5 methods and 2 constructors.

NOTE: Do not add a main method to the solution code.
 */

        Wall defaultConstructors = new Wall();
        System.out.println(defaultConstructors.getWidth());
        System.out.println(defaultConstructors.getHeight());
        System.out.println(defaultConstructors.getArea());
        System.out.print("Enter width and height: ");
        Wall wall = new Wall(scan.nextDouble(), scan.nextDouble());
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());


//================================================================================================================


        //Point Class Object

/*
You have to represent a point in 2D space. Write a class with the name Point. The class needs two fields (instance variables) with name x and y of type int.

The class needs to have two constructors. The first constructor does not have any parameters (no-arg constructor). The second constructor has parameters x and y of type int and it needs to initialize the fields.

Write the following methods (instance methods):
* Method named getX without any parameters, it needs to return the value of x field.
* Method named getY without any parameters, it needs to return the value of y field.
* Method named setX with one parameter of type int, it needs to set the value of the x field.
* Method named setY with one parameter of type int, it needs to set the value of the y field.
* Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
* Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
* Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

How to find the distance between two points?To find a distance between points A(xA,yA) and B(xB,yB), we use the formula:

d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)

Where √ represents square root.




TEST EXAMPLE

→ TEST CODE:

Point first = new Point(6, 5);
Point second = new Point(3, 1);
System.out.println("distance(0,0)= " + first.distance());
System.out.println("distance(second)= " + first.distance(second));
System.out.println("distance(2,2)= " + first.distance(2, 2));
Point point = new Point();
System.out.println("distance()= " + point.distance());

OUTPUT

distance(0,0)= 7.810249675906654
distance(second)= 5.0
distance(2,2)= 5.0
distance()= 0.0

NOTE: Use Math.sqrt to calculate the square root √.

NOTE: Try to avoid duplicated code.

NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 7 methods.

NOTE: Do not add a main method to the solution code.
 */

        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println(first.distance());
        System.out.println();
        System.out.println(first.distance(second));
        System.out.println();
        System.out.println(first.distance(2, 2));


//==================================================================================================================


        //Floor, Carpet & Calculator Class Object
/*
The Carpet Company has asked you to write an application that calculates the price of carpeting for rectangular rooms. To calculate the price, you multiply the area of the floor (width times length) by the price per square meter of carpet. For example, the area of the floor that is 12 meters long and 10 meters wide is 120 square meters. To cover the floor with a carpet that costs $8 per square meter would cost $960.

1. Write a class with the name Floor. The class needs two fields (instance variables) with name width and length of type double.

The class needs to have one constructor with parameters width and length of type double and it needs to initialize the fields.

In case the width parameter is less than 0 it needs to set the width field value to 0, in case the length parameter is less than 0 it needs to set the length field value to 0.

Write the following methods (instance methods):

* Method named getArea without any parameters, it needs to return the calculated area (width * length).


2. Write a class with the name Carpet. The class needs one field (instance variable) with name cost of type double.

The class needs to have one constructor with parameter cost of type double and it needs to initialize the field.

In case the cost parameter is less than 0 it needs to set the cost field value to 0.

Write the following methods (instance methods):

* Method named getCost without any parameters, it needs to return the value of cost field


3. Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor and carpet of type Carpet.

The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and it needs to initialize the fields.

Write the following methods (instance methods):

* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor with a carpet.


TEST EXAMPLE

→ TEST CODE:

Carpet carpet = new Carpet(3.5);
Floor floor = new Floor(2.75, 4.0);
Calculator calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());
carpet = new Carpet(1.5);
floor = new Floor(5.4, 4.5);
calculator = new Calculator(floor, carpet);
System.out.println("total= " + calculator.getTotalCost());

→ OUTPUT

total= 38.5
total= 36.45


NOTE: All methods should be defined as public NOT public static.

NOTE: In total, you have to write 3 classes.

NOTE: Do not add a main method to the solution code.
*/

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());

    }

}
