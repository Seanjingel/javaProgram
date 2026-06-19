package com.dsa.mathematical;

public class HCF {
    public static void main(String[] args) {
        NumbEntry ne = new NumbEntry();
        int n1 = ne.get();
        int n2 = ne.get();
        System.out.println("HCF of numbers is: "+getHCF(n1,n2));

    }
    public static int getHCF(int n1, int n2){
        while(n2!=0){
            int rem = n1%n2;
            n1 = n2;
            n2 = rem;
        }
        return n1;
    }

}
