package com.company.fundamentals;

import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        int fact=1,i;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number: ");

        int n = sc.nextInt();
        if(n==1) fact=0;
        else
        {
            for(i=1;i<=n;i++)
            {
                fact=fact*i;
            }
        }

        System.out.println("com.company.fundamentals.factorial of "+n+" is "+fact);

    }
}
