package com.company.DSA;

import java.util.Scanner;

public class factorial {
    public static int find_factorial(int n)
    {
        int fact = 1;
        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("number? ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = find_factorial(n);
        System.out.println("factorial = "+fact);
    }
}
