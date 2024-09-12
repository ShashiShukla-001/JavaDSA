package com.company.DSA.searching;

public class Search_in_Strings {
    public static void main(String[] args)
    {
        String line = "";
        char target = 'v';
        boolean ans = searchChar2(line,target);
        System.out.println(ans);
    }

    static boolean searchChar(String S, char c)
    {
        if(S.length() == 0) return false;

        for(int i=0; i<S.length(); i++)
        {
            if(S.charAt(i) == c)
            {
                System.out.println("yes "+c+" does exist at index "+i);
                return true;
            }
        }

        return false;
    }

    static boolean searchChar2(String S, char c)
    {
        if(S.length() == 0) return false;

       for(char ch : S.toCharArray())
       {
           if(ch == c)
           {
               System.out.println("yes "+c+" does exist in the string");
               return true;
           }
       }

        return false;
    }

}
