package com.arr.string;

public class StringTest3 {
    public static void main(String[] args) {
        String str1 = "Ratan";
        String str2 = "Soft";
        String str3 = new String("Pankaj");

        // Approach 1 : Using concat
        String res1 = str1.concat(str2);
        System.out.println(res1);
        String st3 = str1.concat(str3);
        System.out.println(st3);

        // Approach 2 : Using "+" operator
        String res2 = str1 + str2;
        System.out.println(res2);
    }
}
