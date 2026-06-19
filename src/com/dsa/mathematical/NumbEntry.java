package com.dsa.mathematical;

import java.util.Scanner;

public class NumbEntry {
    Scanner sc = new Scanner(System.in);
     int get(){
         System.out.println("Enter number: ");
         int num = sc.nextInt();
        return num;
    }


}
