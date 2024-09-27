package com.company.fundamentals.assignments.lec4;

import java.util.Scanner;

public class power_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result =1;
        if(n==0)
        {
            result=1;
        }
        else
        {
            while (n>=1)
            {
                result = result*x;
                n--;
            }
        }

        System.out.println(result);
    }
}
