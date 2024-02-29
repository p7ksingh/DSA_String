package com.arr.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "ratan";
        System.out.println(str1);
        String str2 = new String("ratan");
        System.out.println(str2);
        char[] ch = { 'r', 'a', 't', 'a', 'n' };
        String str3 = new String(ch);
        System.out.println(str3);
        char[] ch1 = { 'r', 'a', 't', 'a', 'n' };
        String str4 = new String(ch1, 2, 2); // 2,2 starts from 2 take the 2 chracters
        System.out.println(str4);
        byte[] b = { 65, 66, 67, 68, 69, 70 };
        String str5 = new String(b);
        System.out.println(str5);
        String str6 = new String(b, 2, 3);
        System.out.println(str6);
    }
}
