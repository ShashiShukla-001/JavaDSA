package com.company.DSA.maths;

import java.util.Scanner;

public class Odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkEven(n);
    }

    static void checkEven(int n)
    {
        if((n&1)==1) System.out.println("odd");
        else System.out.println("even");
    }
}
