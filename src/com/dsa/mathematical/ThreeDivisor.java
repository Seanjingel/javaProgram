package com.dsa.mathematical;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeDivisor {
    public static void main(String[] args) {
        List<Integer> query = new ArrayList<>();
        query.add(3);
        query.add(10);

        System.out.println(query);
        int max = 0;
        List<Integer> list = new ArrayList<>();
        for(int n:query){
            max = Math.max(max,n );
        }
        System.out.println(max);

        int limit = (int) Math.sqrt(max);
        System.out.println(limit);

        boolean[] prime = new boolean[limit+1];
        Arrays.fill(prime,true);
        if (limit >= 0) prime[0] = false;
        if (limit >= 1) prime[1] = false;

        for(int i = 2;i*i<=limit;i++){
            if(prime[i]){
                for(int j = i*i;j<=limit;j += i){
                    prime[j] = false;
                }
            }
        }
        for(boolean b: prime){
            System.out.print(b+", ");
        }
        System.out.println();
        int[] prefix = new int[limit+1];
        for(int i = 1;i<=limit;i++){
            prefix[i] = prefix[i-1];
            if(prime[i]){
                prefix[i]++;
            }
        }
        for(Integer i : prefix){
            System.out.print(i+", ");
        }
        System.out.println();
        for(int n:query){
            int root = (int) Math.sqrt(n);
            list.add(prefix[root]);
        }
        System.out.println(list);
    }
}
