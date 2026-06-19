package com.dsa.mathematical;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12221;
        int reverse = 0;
        if(num<10){
            System.out.println("Not valid number");
            return;
        }
        int temp = num;
        System.out.println(temp);

//        --------------------------------Normal reverse approach----------
//        while(temp>0){
//            int rem = temp % 10;
//            reverse = (reverse*10)+rem;
//            temp = temp/10;
//        }
//        System.out.println("Reversed data: "+reverse);
//        if(reverse == num){
//            System.out.println("number is palindrome");
//        }else{
//            System.out.println("number is not palindrome");
//        }
//        ---------------------------------------------------------------------

        while(num> reverse){
            reverse = reverse*10 + num%10;
            num = num/10;
            System.out.println(reverse+":"+num);

        }
        if(num == reverse || num == reverse/10){
            System.out.println("Palindrome: True");
        }else{
            System.out.println("Palindrom: False");
        }


    }
}
