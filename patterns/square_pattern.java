package com.company.DSA.patterns;

import java.sql.SQLOutput;
import java.util.Scanner;

public class square_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= n; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
