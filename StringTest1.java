package com.arr.string;

public class StringTest1 {
    public StringTest1(String string) {

    }

    public static void main(String[] args) {
        // object class equal method for reference comprision
        StringTest1 t1 = new StringTest1("ratan");
        StringTest1 t2 = new StringTest1("ratan");
        System.out.println(t1.equals(t2));// false,compare reference
        System.out.println(t1 == t2);// true, compare reference

        // String class overriding equals() : content comparision
        String str1 = "anu";
        String str2 = "anu";
        System.out.println(str1.equals(str2));// true,compare content
        System.out.println(str1 == str2);// true

        String s1 = new String("sravya");
        String s2 = new String("sravya");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false
        // StringBuffer class not overriding equals() : uses object class equals()
        StringBuffer sb1 = new StringBuffer("naresh");
        StringBuffer sb2 = new StringBuffer("naresh");
        System.out.println(sb1.equals(sb2));// false
        System.out.println(sb1 == sb2);// false

    }
}
