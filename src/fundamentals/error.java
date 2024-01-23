package fundamentals;

import java.util.Scanner;

public class error {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();

   int i = 2;
   while(i<n/2)
   {
       if(n%i==0)
       {
           return;
       }
   }
        System.out.println("prime");
        System.out.println("hello");



    }
}
