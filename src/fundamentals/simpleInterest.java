package fundamentals;

import java.util.Scanner;


    import java.util.Scanner;
    public class simpleInterest {
        public static int simIn(int p,int t,int r)
        {
            return (p*t*r)/100;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("principal amount?");
            int p= sc.nextInt();
            System.out.println("time in years?");
            int t= sc.nextInt();
            System.out.println("rate of interest?");
            int r= sc.nextInt();
            System.out.println("the simple interest is  "+simIn(p,t,r));
        }
    }

