package fundamentals;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        //int i=1,sum=0;

//        while(i<=n)
//        {
//            sum=sum+i;
//            i++;
//        }
        int sum = n*(n+1)/2;
        System.out.println(sum);
    }
}
