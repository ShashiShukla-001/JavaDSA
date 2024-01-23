package DSA;

import java.util.Scanner;

public class char_half_pyramid {
    public static void main(String[] args) {
        char ch = 'A';

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(ch+"\t");
                ch++;
            }
            System.out.println();
        }
    }
}
