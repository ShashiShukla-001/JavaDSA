package com.company.DSA;
import java.util.Scanner;

public class binary_to_decimal {
    public static void covertToDecimal(int binNum)
    {
        int temp=binNum,decNum = 0, pow = 0,ld;
        while(temp>0)
        {
            ld = temp%10;
            decNum += ld * (int)(Math.pow(2, pow));
            temp=temp/10;
            pow++;
        }
        System.out.println(binNum+" in decimal is "+decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("binary number:");
        int binNum = sc.nextInt();

        covertToDecimal(binNum);
    }
}
