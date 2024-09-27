package com.company.DSA.String_and_StringBuilder;

public class String_builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++)
        {
            char ch = (char)('a' + i);
            sb = sb.append(ch).append(" ");
        }
        System.out.println(sb);
    }
}
