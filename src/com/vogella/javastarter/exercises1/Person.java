package com.vogella.javastarter.exercises1;

//Create a class called Person.
public class Person {
//    Add three instance variables to it, one for storing the first name of the person, one for storing the last name and one for storing the
//    age of the Person.
    String name;
    String lastname;
    int age;
    private Address address;

//    Use the constructor of the Person object to set the values to some default value.
    public Person(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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
