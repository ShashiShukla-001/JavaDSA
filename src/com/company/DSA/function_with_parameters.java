package com.company.DSA;

import java.util.Scanner;

public class function_with_parameters {
    public static void sum(int a, int b)
    {
        System.out.println("sum = "+(a+b));
        return;

    }
    public static void main(String[] args) {
        System.out.println("enter 2 numbers:");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       sum(a,b);
    }
}
