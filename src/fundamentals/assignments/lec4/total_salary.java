package fundamentals.assignments.lec4;

import java.util.Scanner;

public class total_salary {
    public static int get_total_salary(int basic , char grade)
    {
        double hra,da,pf;
        int allow;

        hra =basic/5;
        da = basic/2;

        if(grade=='A')
        {
            allow=1700;
        }
        else if (grade=='B')
        {
            allow = 1500;
        }
        else
        {
            allow = 1300;
        }
        pf = 11*basic/100;

        double  total_salary = basic + hra + da + allow - pf;

        return (int) Math.round(total_salary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic= sc.nextInt();
        char grade = sc.next().charAt(0);

        System.out.println(get_total_salary(basic,grade));
    }
}
