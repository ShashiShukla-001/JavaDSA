package com.company.DSA.Recursion;

public class Binary_Search {
    public static void main(String[] args) {
        int [] arr = {3,5,6,7,8,56,78,90,98};
        int result = binarySearch(arr, 56,0,arr.length-1);
        System.out.println(result);
    }
    static int binarySearch(int arr[], int target, int start,int end)
    {
            if(start>end) return -1;
            else
            {
                int mid = start+ (end-start)/2;
                if (arr[mid] == target) return mid;
                else if(arr[mid]>target) return binarySearch(arr,target,start,mid-1);
                else return binarySearch(arr,target,mid+1,end);
            }

    }
}
