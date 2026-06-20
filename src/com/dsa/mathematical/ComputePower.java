package com.dsa.mathematical;

public class ComputePower {
    public static void main(String[] args) {
        int base = NumbEntry.get();
        int exponent = NumbEntry.get();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        System.out.println(result);


    }
}
