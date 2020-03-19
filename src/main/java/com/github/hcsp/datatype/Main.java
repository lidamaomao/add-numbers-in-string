package com.github.hcsp.datatype;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }


    public static String add(String a, String b) {

        int aInt;
        int bInt;

        if (a == null) {
            aInt = 0;
        } else {
            aInt = Integer.parseInt(a);
        }
        if (b == null) {
            bInt = 0;
        } else {
            bInt = Integer.parseInt(b);
        }
        int i = aInt + bInt;
        return String.valueOf(i);

    }

}
