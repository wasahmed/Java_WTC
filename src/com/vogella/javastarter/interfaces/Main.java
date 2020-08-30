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

//        An abstract class is a class that is declared abstract —it may or may not include abstract methods.
//        Abstract classes cannot be instantiated, but they can be subclassed. When an abstract class is subclassed,
//        the subclass usually provides implementations for all of the abstract methods in its parent class.
    }
}
