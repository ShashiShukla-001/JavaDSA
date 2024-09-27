package com.company.DSA.searching;

import java.util.Arrays;

public class Binary_search {
    public static void main(String[] args) {
        int[] arr = {2,9,3,5,7,11,3,45,32,12,8,51};
        boolean result = binarySearch(arr,51);
        System.out.println(result);
    }

    static boolean binarySearch(int[] arr, int target)
    {
        Arrays.sort(arr);
        int start,end,mid;
        start = 0;
        end = arr.length -1;

        if(arr.length == 0) return false;

        while(start<=end)
        {
            mid = (start+end)/2;
            if (arr[mid] == target)
            {
                return true;
            }
            else if(arr[mid] > target)
            {
                end = mid-1;
            }
            else if(arr[mid] < target)
            {
                start = mid+1;
            }
        }
        return false;
    }
}
