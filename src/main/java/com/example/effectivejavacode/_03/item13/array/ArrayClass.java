package com.example.effectivejavacode._03.item13.array;
public class ArrayClass implements Cloneable{
    private int [] arr = new int [10];
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayClass arr1 = new ArrayClass();
        ArrayClass copy1 = (ArrayClass) arr1.clone();
        System.out.println(arr1 != copy1);           // true
        System.out.println(arr1.arr != copy1.arr);   // false
    }
}
