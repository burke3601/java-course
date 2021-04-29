package com.company;

public class Main {

    public static void main(String[] args) {
        byte lilByte = 8;
        short lilShort = 1000;
        int lilInt = 123456789;
        long lilLong =  (50000 + (10 * (lilByte +lilShort + lilInt)));
        // no casting needed here

        System.out.println("lilLong = " + lilLong);
    }
}
