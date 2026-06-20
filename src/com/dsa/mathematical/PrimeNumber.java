package com.dsa.mathematical;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = NumbEntry.get();
        boolean isPrime = false;
        if(n <= 1){
            System.out.println("Invalid Number!");
        }
        for(int i = 2; i*i < n;i++){
            if(n % i == 0) {
                isPrime = false;
            }
            else{
                isPrime = true;
            }
        }
        System.out.println(isPrime ? "Number is prime" : "Number is not prime");

    }
}
