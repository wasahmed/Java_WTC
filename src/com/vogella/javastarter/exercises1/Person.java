package com.vogella.javastarter.exercises1;

//Create a class called Person.
public class Person {
//    Add three instance variables to it, one for storing the first name of the person, one for storing the last name and one for storing the
//    age of the Person.
    private String name;
    private  String lastname;
    private int age;

//    Use the constructor of the Person object to set the values to some default value.
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

//    Add a toString method.  This method is used to convert the object to a String representation.
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
