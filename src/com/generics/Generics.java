package com.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Generics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Max Int\n2.Max Float\n3.Max String\n4. Exit");
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter a number");
                int num1 = sc.nextInt();
                System.out.println("Enter a number");
                int num2 = sc.nextInt();
                System.out.println("Enter a number");
                int num3 = sc.nextInt();
                MyGeneric myGenericInt = new MyGeneric(num1, num2, num3);
                myGenericInt.max(num1, num2, num3);
                break;

            case 2:
                System.out.println("Enter a number");
                float float1 = sc.nextFloat();
                System.out.println("Enter a number");
                float float2 = sc.nextFloat();
                System.out.println("Enter a number");
                float float3 = sc.nextFloat();
                MyGeneric myGenericFloat = new MyGeneric(float1, float2, float3);
                myGenericFloat.max(float1, float2, float3);
                break;

            case 3:
                System.out.println("Enter a word");
                String str1 = sc.next();
                System.out.println("Enter a word");
                String str2 = sc.next();
                System.out.println("Enter a word");
                String str3 = sc.next();
                MyGeneric myGenericStr = new MyGeneric(str1, str2,str3);
                myGenericStr.max(str1, str2,str3);
                break;

            case 4:
                break;

            default:
                System.out.println("Enter a valid option\n");
                break;
        }
    }
}
