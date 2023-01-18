package com.generics;

import java.util.Arrays;

public class MyGeneric <T extends Comparable> {
    T[] array;
    public MyGeneric(T array[]){
        this.array = array;
    }
    public T findMaxElement(){
        Arrays.sort(array);
        return array[array.length-1];
    }
}
