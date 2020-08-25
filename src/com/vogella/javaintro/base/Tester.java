package com.vogella.javaintro.base;

public class Tester {
    public static void main(String[] args) {
        System.out.println(MyStaticExample.PLACEHOLDER);
        MyStaticExample.test();
    }
}
//    If you define a static variable, the Java runtime environment
//    associates one class variable for a class no matter how many
//    instances (objects) exist. The static variable can therefore be seen as a global variable.
