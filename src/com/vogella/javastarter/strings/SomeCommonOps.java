package com.vogella.javastarter.strings;

public class SomeCommonOps {
    public static void main(String[] args) {
        System.out.println("Test".equalsIgnoreCase("test1"));

        String testStr = "TEst string";
        System.out.println(testStr.charAt(0));

        System.out.println(testStr.substring(5,7));

        System.out.println(testStr.indexOf("string"));

        String[] array = testStr.split(" ");
        System.out.println(array[0]);




    }
}
