package com.dsa.mathematical;

public class GP {
    public static void main(String[] args) {
        int a = NumbEntry.get();
        int b = NumbEntry.get();
        int n = NumbEntry.get();

        int ratio =  b/a;
        int res = (int) (a* Math.pow(ratio,n-1));

        System.out.println(res);
    }
}
