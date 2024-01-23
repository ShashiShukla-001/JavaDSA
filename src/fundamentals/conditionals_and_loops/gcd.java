package fundamentals.conditionals_and_loops;

import java.lang.Math.*;
import java.util.Scanner;
public class gcd {
    public static void main(String[] args) {
        int gcd=1,i;
        Scanner sc=new Scanner(System.in);

        System.out.println("first number?");
        int n1=sc.nextInt();
        int k1= (int) Math.sqrt(n1);

        System.out.println("second number?");
        int n2=sc.nextInt();
        int k2= (int) Math.sqrt(n2);

        for(i=1;i<=k1 && i<=k2;i++)
        {
            if((n1%i==0)&&(n2%i==0))
            {
                gcd=i;
            }
        }
        System.out.println(gcd);


    }
}
