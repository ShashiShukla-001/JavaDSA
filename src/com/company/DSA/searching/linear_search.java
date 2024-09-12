package com.company.DSA.searching;

public class linear_search {
    public static void main(String[] args){
    int[] nums = {2,3,4,5,7,89,21,34,65,4};
    int target = 212;

    int ans = (linearSearch(nums, target));
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target)
    {
        if(arr.length == 0)
        {
            return Integer.MAX_VALUE;
        }

       for(int element : arr) {
           if(element == target) return element;
       }

        return Integer.MAX_VALUE;
    }
}
