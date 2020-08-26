package com.vogella.javastarter.types;

import java.util.Date;

public class Types {
    public static void main(String[] args) {
        // Convert from int to String
        String s1 = String.valueOf(10);
        System.out.println(s1);

        // Convert from double to String
        String s2 = String.valueOf(Math.PI);
        System.out.println(s2);

        // Convert from boolean to String
        String s3 = String.valueOf ( 1 < 2 );
        System.out.println(s3);

        // Convert from date to String
        String s4 = String.valueOf ( new Date() );
        System.out.println(s4);


//        // Conversion from String to int
//        int i = Integer.parseInt(String);
//        // Conversion from float to int
//        float f = Float.parseFloat(String);
//        // Conversion from double to int
//        double d = Double.parseDouble(String);
    }
}
