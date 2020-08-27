package com.vogella.javastarter.interfaces;

public interface Interfaces {

    String constant = "This is a constant. Interfaces can have constants which are always implicitly public, static and final.";

    void AbstractMethod();

    void SayMyName(String name);

    // default method
    default String reserveString(String s){
        return new StringBuilder(s).reverse().toString();
    }

}

//An interface is a type similar to a class and is defined via the interface keyword. Interfaces are used to define common behavior
// of implementing classes. If two classes implement the same interface, other code which work on the interface level, can use objects
// of both classes.

//Like a class an interface defines methods. Classes can implement one or several interfaces. A class which implements an interface must
// provide an implementation for all abstract methods defined in the interface.

//An interface can have abstract methods and default methods. A default method is defined via the default keyword at the beginning of the
// method signature. All other methods defined in an interfaces are public and abstract; explicit declaration of these modifiers is optional.

//Interfaces can have constants which are always implicitly public, static and final.



//A class can implement an interface. In this case it must provide concrete implementations of the abstract interface methods.
// If you implement a method defined by an interface, you can use @Override annotation. This indicates to the Java compiler that
// you actually want to implement a method defined by this interface. This way the compiler can give you an error in you mis-typed
// the name of the method or in the number of arguments.
