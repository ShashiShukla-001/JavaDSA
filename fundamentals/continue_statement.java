package com.company.fundamentals;

import java.util.Scanner;

public class continue_statement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("number:");
            n = sc.nextInt();
            if(n%10==0)
            {
                continue;
            }
            System.out.println(n);
        }
        while(true);
    }
}
