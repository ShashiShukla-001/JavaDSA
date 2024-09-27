package com.company.DSA.searching;

public class Order_Agnostic_Binary_Search {
    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1};
        int result = orderAgnosticBinarySearch(arr, 6);
        System.out.println(result);

    }
    static int orderAgnosticBinarySearch(int[] arr, int target)
    {
        int start = 0;
        int end = arr.length - 1;
        Boolean isAsc = true;

        if(arr[start] >= arr[end]) isAsc = false;

        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(arr[mid] == target) return mid;
            else if(arr[mid] > target)
            {
                if(isAsc) end = mid-1;
                else start = mid+1;
            }
            else if(arr[mid] < target)
            {
                if(isAsc) start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }
}
