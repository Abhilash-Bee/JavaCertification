package com.java_jar_usage;

import com.java.jar.Series;

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of n Series");
        for (int i=0; i<=10; i++)
            System.out.println(Series.nSum(i));
        System.out.println("================================");

        System.out.println("n Factorial");
        for (int i=0; i<=10; i++)
            System.out.println(Series.factorial(i));
        System.out.println("================================");

        System.out.println("n Fibonacci");
        for (int i=0; i<=10; i++)
            System.out.println(Series.fibonacci(i));
        System.out.println("================================");

    }

}
