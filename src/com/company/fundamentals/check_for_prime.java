package com.company.fundamentals;

import java.util.Scanner;

public class check_for_prime {
    public static void main(String[] args) {
        int i = 2, flag = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(i*i<n)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
                flag++;
               break;
            }
            i++;
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
    }
}
