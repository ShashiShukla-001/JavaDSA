package DSA;

import java.util.Scanner;

public class calculate_binomial_coeffecient {
    public static float find_bin_coeff(int n, int r){
        int fact_n = find_factorial(n);
        int fact_r = find_factorial(r);
        int fact_nr = find_factorial(n-r);

        return (fact_n/(fact_r*fact_nr));
    }
    public static int find_factorial(int n)
    {
        int fact = 1;

        for(int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("n?");
        int n = sc.nextInt();

        System.out.println("r?");
        int r = sc.nextInt();

        float binomial_coeff = find_bin_coeff(n,r);

        System.out.println("binomial coefficient: "+binomial_coeff);
    }
}
