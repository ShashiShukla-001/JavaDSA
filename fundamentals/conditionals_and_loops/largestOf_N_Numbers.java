package com.company.fundamentals.conditionals_and_loops;

import java.util.Scanner;
public class largestOf_N_Numbers {
    public static void main(String[] args) {
        int i,largest=-1000000;

        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers?");
        int n = sc.nextInt();

        int[] A= new int[n];

        System.out.println("enter the numbers: ");
        for(i=0;i<n;i++)
        {
            A[i]= sc.nextInt();
        }
        largest=A[0];

        for(i=0;i<n-1;i++)
        {
            if(A[i+1]>=A[i])
            {
                largest=A[i+1];
            }
        }
        System.out.println(largest+ " is the largest number");

    }

}
