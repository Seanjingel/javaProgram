package com.dsa.mathematical;

public class TrailingZeroInFactorial {
    public static void main(String[] args) {
        long num = 15;
//        ---------------------------------Using brute force---------------
//        long fact = 1;

//        for(int i = 2;i<= num;i++){
//            fact = fact * i;
//        }
        int count = 0;
//        while(fact>0){
//            if(fact%10 == 0){
//                count++;
//                fact = fact/10;
//                continue;
//            }else{
//                break;
//            }
//        }
//        ------------------------------------------------------------------

        while(num>0){
            num = num/5;
            count += num;

        }
        System.out.println("Traling zero count is: "+count);
    }
}
