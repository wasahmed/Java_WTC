package com.vogella.javastarter.interfaces;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.AbstractMethod();
        girl.SayMyName("Jenna");

        Boy boy = new Boy();
        boy.AbstractMethod();
        boy.SayMyName("Jack");
        System.out.println(boy.reserveString("reverse string"));
    }
}
