package com.dsa.mathematical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberList {
    public static void main(String[] args) {
        int n = NumbEntry.get();
        if(n<2){
            System.out.println("No Prime Number");
            return;
        }
        List<Integer> list = new ArrayList<>();
        list = getPrimeNumberList2(n);

        System.out.println("All prime number under "+n+" is: "+list);
    }

    public static List<Integer> getPrimeNumberList2(int n){
        boolean[] isPrime = new boolean[n+1];
        List<Integer> list = new ArrayList<>();
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }
        return list;
    }


    public static List<Integer> getList3(int n){
        List<Integer> list = new ArrayList<>();

        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i = 2;i*i<n;i++){
            if(isPrime[i]){
                for(int j =i*i;j<n;j++){

                }

            }
        }
        return list;
    }

    public static  List<Integer> getPrimeList1(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=2;i<=n; i++){
            boolean isPrime = true;
            for(int j = 2;j*j<= i;j++){
                if(i%j == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                list.add(i);
            }
        }
        return list;
    }
}
