package com.generics;

public class MyGeneric <T> {
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
