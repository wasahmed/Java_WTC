package com.vogella.javastarter.strings;

public class CompareStrings {
    String a;
    String b;

    public CompareStrings(String a, String b) {
        this.a = a;
        this.b = b;
    }

    public void checkEquality(){
        if (a==b){
            System.out.println("equal. Statement returns true because of Java's String pool for memory efficiency. It returns" +
                    "true because a and b point to the same constant... To compare the String objects s1 and s2, use the s1.equals(s2) method.");
        }
        else {
            System.out.println("not equal");
        }
    }
}
