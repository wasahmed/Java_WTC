package com.vogella.javastarter.conditionals;

public class Conditionals {
    static void IfThenExample()
    {
        int number = 5;
        if (number > 0) { //if part
            System.out.println("This statement is only executed when number is positive."); //then part
        }
        System.out.println("This statement is always executed.");
    }

    static void IfThenElseExample()
    {
        int number = 5;
        if (number > 0) { //evaluates to true
            System.out.println("This statement is only executed when the condition '(number>0)' in the if-statement is met");
        }else{
            System.out.println("This statement is only executed when the condition '(number>0)' in the if-statement is not met");
        }
        System.out.println("This statement is always executed.");
    }

    public static void main(String[] args) {
        IfThenExample();
        IfThenElseExample();
    }
}
