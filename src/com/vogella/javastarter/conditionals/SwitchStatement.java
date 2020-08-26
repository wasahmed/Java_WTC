package com.vogella.javastarter.conditionals;

public class SwitchStatement {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i) {
                case 1:
                case 5:
                    System.out.println("Hello");
                    break;
                default:
                    System.out.println("Default");
                    break;
            }
        }
    }
}
