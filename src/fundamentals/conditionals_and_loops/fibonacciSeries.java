package fundamentals.conditionals_and_loops;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter N : ");
        int n=sc.nextInt();

        int[] A = new int[n];
        A[0]=0;
        A[1]=1;
        for(int i=2;i<n;i++)
        {
            A[i]=A[i-1]+A[i-2];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(A[i]);
        }

        System.out.println("enter the number to search for: ");
        int x=sc.nextInt(), flag=0, j;

        for(j=0;j<n;j++)
        {
            if(x==A[j])
            {
                flag=1;
                break;
            }
        }
        if(flag!=0) System.out.println("element found at index "+j);

    }
}
