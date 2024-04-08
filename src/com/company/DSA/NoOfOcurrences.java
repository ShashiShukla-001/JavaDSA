package com.company.DSA;

import java.util.Scanner;

public class NoOfOcurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        System.out.println("give the no. to check for");
        int x = sc.nextInt();

        int count = 0,rem;

        while(n>0)
        {
            rem = n%10;
            if(rem == x)
            {
                count++;
            }
            n /= 10;
        }
        System.out.println(x+" occurs "+count+" times");
    }
}
