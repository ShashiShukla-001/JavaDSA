package com.company.DSA.searching;

public class Search_in_range {
    public static void main(String[] args)
    {
        int[] nums = {3,4,1,2,4,5,3,6,2,1,3};
        int start = 2;
        int end = 9;
        int target = 8;

        search(nums,target,start,end);
    }

    static void search(int[] nums,int target, int start, int end)
    {
        if(nums.length == 0)
        {
            System.out.println("element does not exist");
        }

        for(int i=start; i<=end; i++)
        {
            if(nums[i] == target)
            {
                System.out.println("target "+target+" is at index "+i);
                return;
            }
        }
        System.out.println("element does not exist");
    }
    {

    }
}
