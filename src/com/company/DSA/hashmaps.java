package com.company.DSA;

import java.util.*;

public class hashmaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        hm.put("India", 200);
        hm.put("China", 150);
        hm.put("us", 100);
        hm.put("Rome", 50);
//        System.out.println(hm);
//
//        System.out.println(hm.get("India"));
//
//        System.out.println(hm.containsKey("India"));
//        System.out.println(hm.containsKey("Russia"));
//
//        System.out.println(hm.remove("China"));

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k:keys
             ) {
            System.out.println("key= "+k+", value= "+hm.get(k));
        }

    }
}
