package com.company.fundamentals.conditionals_and_loops;

import java.util.Scanner;

public class largestOfThreeNumbers {
    public static void Largest(int a, int b, int c)
    {
        if(a>=b && a>=c)
        {
            System.out.println(a+ " is largest");
        }
        else if(b>=a && b>=c)
        {
            System.out.println(b+ " is largest");
        }
        else
        {
            System.out.println(c+" is largest");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("first number?");
        int a = sc.nextInt();
        System.out.println("second number?");
        int b = sc.nextInt();
        System.out.println("third number?");
        int c = sc.nextInt();

        Largest(a,b,c);
    }
}
