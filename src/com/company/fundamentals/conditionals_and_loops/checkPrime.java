package com.company.fundamentals.conditionals_and_loops;

import java.util.Scanner;

public class checkPrime {
    public static void isPrime(int n)
    {
//        int count=0,i;
//        for(i=2;i<n/2;i++)
//        {
//            if(n%i==0)
//            {
//                System.out.println(n+" is not prime");
//                count++;
//                break;
//            }
//        }
//        if(count==0) System.out.println(n+" is prime");

        boolean isPrime= true;
        int i=2;
        while(i<=n/2)
        {
            if(n%i==0)
            {
                isPrime = false;
            }
            i++;
        }
        if(isPrime)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("composite");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        isPrime(n);

    }
}
