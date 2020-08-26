package com.vogella.javastarter.strings;

public class Strings {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello ");
        System.out.println(str);

        str.append("World ");
        System.out.println(str);

        CompareStrings compstr = new CompareStrings("hello", "hello");
        compstr.checkEquality();
    }
}
//    The String class represents character strings. All string literals, for example, "hello", are implemented as
//    instances of this class. An instance of this class is an object. Strings are immutable, e.g., an assignment of
//    a new value to a Stringobject creates a new object. To concatenate Strings use a StringBuilder.