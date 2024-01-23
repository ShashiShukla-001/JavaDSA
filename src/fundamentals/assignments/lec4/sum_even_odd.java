package fundamentals.assignments.lec4;

import java.util.Scanner;

public class sum_even_odd {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int even_sum = 0 , odd_sum = 0;
        int r;
        while(n>=1)
        {
            r=n%10;
            if(r%2==0)
            {
                even_sum+=r;
            }
            else
            {
                odd_sum += r;
            }
            n=n/10;
        }
        System.out.println(even_sum+" "+odd_sum);


    }
}
