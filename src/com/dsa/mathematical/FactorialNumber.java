package com.dsa.mathematical;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 15;
        int fact = 1;
//        ----------------Using while Loop------------
//        while(num>0){
//            fact = fact*num;
//            num--;
//        }

//        ----------------Using for  loop--------------------
        for(int i = 1;i<=num;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of number"+" is: "+fact);
    }
}
