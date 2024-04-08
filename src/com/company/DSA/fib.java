package com.company.DSA;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of n: ");

        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while(count<=n)
        {
            int temp = b;
            b = a+b;
            a = temp;
            count++;
        }
        System.out.println("the "+n+"th fibonacci number is - "+b);

    }
}
