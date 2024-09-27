package com.company.DSA.String_and_StringBuilder;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String og = sc.nextLine();

        og = og.toLowerCase();

        int start = 0;
        int end = og.length()-1;
        boolean flag = true;

        while(start<=end)
        {
            if(og.charAt(start) == og.charAt(end))
            {
                start++;
                end--;
            }
            else
            {
                flag = false;
                break;
            }
        }
        if(flag) System.out.println("pallindrome");
        else System.out.println("not pallindrome");
    }
}
