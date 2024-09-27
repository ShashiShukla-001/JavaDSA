package com.company.DSA.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int ans = prodOfDigits(n);
        System.out.println(ans);

    }

    static int sumOfDigits(int n)
    {
        if(n%10 == n) {
            return n;
        }
        return (n%10) + sumOfDigits(n/10);
    }

    static int prodOfDigits(int n)
    {
        if(n<10)
        {
            return n;
        }
        return (n%10) * prodOfDigits(n/10);
    }
}
