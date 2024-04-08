package com.company.fundamentals.conditionals_and_loops;

import java.util.Scanner;

public class AllPrime {
    public static int isPrime(int number)
    {
        int count=0,i;
        for(i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            return number;
        }
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            int x=isPrime(i);
            if(x!=0) System.out.println(x);
        }
    }
}
