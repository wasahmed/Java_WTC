package com.vogella.javastarter.exercises1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("john", "snow", 20);
        Person person2 = new Person("jill", "william", 20);
        System.out.println(person1);
        System.out.println(person2);

        // Jill gets married to john
        person2.setLastname(person1.getLastname());
        System.out.println(person2);

        Address address = new Address();
        address.setCity("PTA");
        address.setCountry("SA");
        address.setNumber("1");
        address.setPostalCode("12345");
        address.setStreet("WTC street");

        person1.setAddress(address);
        address = null;

        person1.getAddress().setNumber("2");
        System.out.println(person1.getAddress());
    }
}
