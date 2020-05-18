package com.github.hcsp.datatype;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }
    // 给出两个数字字符串a和b，返回其中的数字相加后的字符串结果。
    // 例如，给定a="123",b="456"，返回"579"，因为123+456=579
    // 注意，若参数为null，则当作0处理，即add("123", null)=="123", add(null, null)=="0"
    public static String add(String a, String b) {
        int i = 0;
        int j = 0;
        if (a == null) {
            i = 0;
        } else {
            int helpA = 1;
            for (int indexOfA = a.length() - 1; indexOfA >= 0; indexOfA --) {
                if (a.charAt(indexOfA) == '-') {
                    i *= -1;
                    continue;
                }
                i += (a.charAt(indexOfA) - 48) * helpA;
                helpA *= 10;
            }
        }
        if (b == null) {
            j = 0;
        } else {
            int helpB = 1;
            for (int indexOfB = b.length() - 1; indexOfB >= 0; indexOfB --) {
                if (b.charAt(indexOfB) == '-') {
                    j *= -1;
                    continue;
                }
                j += (b.charAt(indexOfB) - 48) * helpB;
                helpB *= 10;
            }
        }
        return String.valueOf(i + j);
    }
}
