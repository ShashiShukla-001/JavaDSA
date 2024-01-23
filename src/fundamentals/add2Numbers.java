package fundamentals;

import java.util.Scanner;
public class add2Numbers {
    public static int add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("first number?");
        int a= sc.nextInt();
        System.out.println("second number?");
        int b= sc.nextInt();
        System.out.println("the sum of "+a+" and "+b+" is "+add(a,b));
    }
}
