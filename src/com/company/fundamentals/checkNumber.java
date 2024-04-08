package com.company.fundamentals;

import java.util.Scanner;

public class checkNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");
        int n= sc.nextInt();
        if(n==0)
        {
            System.out.println(0);
        }
        else if(n>0)
        {
            System.out.println(1);
        }
        else System.out.println(-1);
    }
}
