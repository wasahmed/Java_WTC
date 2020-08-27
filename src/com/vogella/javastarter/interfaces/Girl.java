package com.vogella.javastarter.interfaces;

public class Girl implements Interfaces{

    @Override
    public void AbstractMethod(){
        System.out.println("Hello I am a girl");
    }

    @Override
    public void SayMyName(String name) {
        System.out.println("My name is: " + name);
    }
}
