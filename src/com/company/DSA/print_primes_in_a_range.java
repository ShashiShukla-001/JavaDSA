package com.company.DSA;

import java.util.Scanner;

public class print_primes_in_a_range {
    public static boolean isPrime(int x)
    {
        if(x==2)
        {
            return true;
        }
        for(int i=2; i*i<=x; i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int m, int n)
    {
        for(int i=m; i<=n; i++ )
        {
            if(isPrime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("from:");
        int m = sc.nextInt();

        System.out.println("to:");
        int n = sc.nextInt();

        primeInRange(m,n);
    }
}
