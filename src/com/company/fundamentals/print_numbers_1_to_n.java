package com.company.fundamentals;
import java.util.Scanner;

public class print_numbers_1_to_n {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(i<=n)
        {
            System.out.print(i+"\t");
            i++;
        }

    }
}
