package com.company.fundamentals;

import java.util.Scanner;

public class check_for_prime_using_function {
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2; i*i<=n; i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(isPrime(n));
    }
}
