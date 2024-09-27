package com.company.DSA.maths;

public class NoOfDigitsInBinary {
    public static void main(String[] args) {
        int n = 10;
        int digit = (int) (Math.log(n)/Math.log(2)) + 1;
        System.out.println(digit);
    }
}
