package alpha_batch;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>= 1)
        {
            System.out.print(n%10);
            n = n/10;
        }
    }
}
