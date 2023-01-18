package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        MyGeneric myGeneric;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Max Int\n2.Max Float\n3.Max String\n4. Exit");
        int option = sc.nextInt();
        int n;
        switch(option){
            case 1:
                System.out.println("Enter the no.of Integers you want to check\n");
                n = sc.nextInt();
                Integer[] arrInt = new Integer[n];
                for(int i = 0; i < arrInt.length; i++) {
                    System.out.println("Enter the values");
                    arrInt[i] = sc.nextInt();
                }
                myGeneric = new MyGeneric(arrInt);
                System.out.println("Max integer is " + myGeneric.findMaxElement());
                break;

            case 2:
                System.out.println("Enter the no.of Integers you want to check\n");
                n = sc.nextInt();
                Float[] arrFloat = new Float[n];
                for(int i = 0; i < arrFloat.length; i++) {
                    System.out.println("Enter the values");
                    arrFloat[i] = sc.nextFloat();
                }
                myGeneric = new MyGeneric(arrFloat);
                System.out.println("Max floating number is " + myGeneric.findMaxElement());
                break;

            case 3:
                System.out.println("Enter the no.of Integers you want to check\n");
                n = sc.nextInt();
                String[] arrStr = new String[n];
                for(int i = 0; i < arrStr.length; i++) {
                    System.out.println("Enter the values");
                    arrStr[i] = sc.nextLine();
                }
                myGeneric = new MyGeneric(arrStr);
                System.out.println("Max String is " + myGeneric.findMaxElement());
                break;

            case 4:
                break;

            default:
                System.out.println("Enter a valid option\n");
                break;
        }
    }
}
