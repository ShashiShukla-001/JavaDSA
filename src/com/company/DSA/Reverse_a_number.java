package com.company.DSA;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        int n = 2345678;
        while (n>0)
        {
            System.out.print(n%10);
            n /= 10;
        }
    }
}
