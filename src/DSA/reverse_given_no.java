package alpha_batch;

import java.util.Scanner;

public class reverse_given_no {
    public static void main(String[] args) {
        int n, last_digit, rev = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        while(n>0)
        {
            last_digit = n%10;
            rev = rev*10 + last_digit;
            n /= 10;
        }
        System.out.print(rev);

    }
}
