package com.company.fundamentals.conditionals_and_loops;

import java.util.Scanner;

public class upperCase_or_lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if('A'<=ch && ch<='Z')
        {
            System.out.println("upper case");
        }
        else if('a'<= ch && ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("can not determine");
        }


    }
}
