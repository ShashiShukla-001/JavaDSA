package com.company.DSA.maths;

public class CheckIfPowerOfTwo {
    public static void main(String[] args) {
        int n = 128;
        if(n==0)
        {
            System.out.println("flase");
            return;
        }
        if((n&(n-1))==0) System.out.println("true");
        else System.out.println("false");
    }
}
