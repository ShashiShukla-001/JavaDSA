package com.company.DSA.maths;

public class Unique_element_in_array {
    public static void main(String[] args) {
        int[] arr = {2,3,3,4,1,2,6,4,1,6,10};
        System.out.println(uniqueElement(arr));
    }

    private static int uniqueElement(int[] arr) {
        int unique = 0;
        for(int n : arr)
        {
            unique = unique^n;
        }
        return unique;
    }
}
