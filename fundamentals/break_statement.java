package com.company.fundamentals;

import java.util.Scanner;

public class break_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        do{
            number = sc.nextInt();
            if(number%10==0)
            {
                break;
            }
            System.out.println(number);
        }
        while(true);
    }
}
