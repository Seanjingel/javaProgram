package com.dsa.mathematical;

public class LCM {
    public static void main(String[] args) {
        NumbEntry ne = new NumbEntry();
//        int n1 = ne.get();
//        int n2 = ne.get();
//        int n3 = ne.get();
        int[] nums = {4, 6, 8, 12};
        int res = nums[0];
        for(int i = 1;i<nums.length;i++){
            res = getLCM(res,nums[i]);
        }

        System.out.println("Lcm of given numbers is: "+res);
    }

    public static int getLCM(int n1, int n2){
        return (n1/HCF.getHCF(n1,n2))*n2;
    }
}
