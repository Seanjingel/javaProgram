package com.dsa.mathematical;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DivisorList {
    public static void main(String[] args) {
        int n = NumbEntry.get();
        List<Integer> list = new ArrayList<>();
        list = getDivisorList(n);
//        for(int i = 1; i <= n;i++){
//            if(n % i == 0){
//                list.add(i);
//            }
//        }
        System.out.println("All divisor of number ar: "+list);


    }
    public static List<Integer> getDivisorList(int num){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i * i <= num ; i++){
            if(num % i == 0){
                list.add(i);
                if (i != num/i){
                    list.add(num/i);
                }
            }
        }
        Collections.sort(list);

        return  list;
    }
}
