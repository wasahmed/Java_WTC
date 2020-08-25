package com.vogella.javaintro.base;

public class MyStaticExample {
    static String PLACEHOLDER = "TEST";

    static void test(){
        System.out.println("Hello");
    }
}
//    If you define a static variable, the Java runtime environment
//    associates one class variable for a class no matter how many
//    instances (objects) exist. The static variable can therefore be seen as a global variable.