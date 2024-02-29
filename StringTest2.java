package com.arr.string;

public class StringTest2 {
    public static void main(String... ratan) {
        String str1 = "ramu";
        String str2 = "durga";
        String str3 = "ramu";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str2.equals(str3)); // false
        System.out.println("ratan".equals("RATAN")); // false
        System.out.println("ratan".equalsIgnoreCase("RATAN")); // true

        System.out.println(str1.compareTo(str2)); // +ve
        System.out.println(str1.compareTo(str3)); // 0
        System.out.println(str2.compareTo(str1)); // -ve
        System.out.println("ratan".compareTo("ratna")); // -ve
        System.out.println("ratan".compareTo("RATAN")); // +ve
        System.out.println("ratan".compareToIgnoreCase("RATAN"));// 0

        System.out.println("anu".compareTo("anutnrtrt"));// -6
        System.out.println("anutnrtrt".compareTo("anu"));// 6
    }
}
