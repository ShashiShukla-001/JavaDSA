package fundamentals;

import java.util.Scanner;

public class farToCel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Start (0 <= S <= 80) : ");
        int S = sc.nextInt();

        System.out.println("End (S <= E <=  900) : ");
        int E = sc.nextInt();

        System.out.println("step size (0 <= W <= 40 ) : ");
        int W = sc.nextInt();

        int C;

        while(S<=E)
        {
           C = 5*(S-32)/9;
           System.out.println(S+" --> "+C);
           S=S+W;
        }

    }

}
