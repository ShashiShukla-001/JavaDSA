package com.company.fundamentals;

import java.util.Scanner;

public class Average_Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();


        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3= sc.nextInt();

        System.out.println(name);

        int avg = (m1+m2+m3)/3;

        System.out.println(avg);



    }
}
