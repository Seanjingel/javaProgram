package com.dsa.mathematical;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = NumbEntry.get();
        if(n <= 1){
            System.out.println("Invalid Number!");
        }
        for(int i = 2; i*i < n;i++){
            if(n % i == 0) {
                System.out.println("Number is not prime");
            }
            else{
                System.out.println("Number is prime");
            }
        }

    }
}
