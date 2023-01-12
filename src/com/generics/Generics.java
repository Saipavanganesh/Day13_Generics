package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class MyGeneric<T> {
      T a1,a2,a3;
    public MyGeneric(T a1, T a2, T a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
   public static <T extends Comparable> void max(T a1, T a2, T a3){
        T maxElement;
       if (a1.compareTo(a2) > 0){
           if(a1.compareTo(a3) > 0){
               System.out.println("Maximum is " + a1);
           }
           else{
               System.out.println("Maximum is " + a2);
           }
       }
       else{
           if(a2.compareTo(a3) > 0){
               System.out.println("Maximum is " + a2);
           }
           else{
               System.out.println("Maximum is " + a3);
           }
       }
    }
}
public class Generics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        float num1 = sc.nextFloat();
        System.out.println("Enter a number");
        float num2 = sc.nextFloat();
        System.out.println("Enter a number");
        float num3 = sc.nextFloat();
        MyGeneric myGeneric = new MyGeneric(num1, num2, num3);
        MyGeneric.max(num1, num2, num3);
    }
}
