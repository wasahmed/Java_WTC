package com.vogella.javastarter.interfaces;

public class Boy implements Interfaces {
    @Override
    public void AbstractMethod(){
        System.out.println("Hello I am a boy");
    }

    @Override
    public void SayMyName(String name) {
        System.out.println("My name is: " + name);
    }
}
