package com.company.DSA.maths;

import java.lang.reflect.Array;
import java.util.Arrays;

public class uniqueNoWhereAllThrice {
    public static void main(String[] args) {
        int[] arr = {2,3,3,2,2,4,3,4,98,4};
        int[] sum = new int[32];
        int count=0;
        for(int i=0; i<arr.length; i++)
        {
            int temp = arr[i];
            count=0;
            while(temp>0)
            {
                sum[count] += (temp&1);
                temp = temp >> 1;
                ++count;
            }
        }
        System.out.println(Arrays.toString(sum));
        int result = 0;
        for(int i=0; i< sum.length; i++ )
        {
            if(sum[i]%3 != 0)
            {
                result += (1 << i );
            }
        }
        System.out.println(result);



    }

}
