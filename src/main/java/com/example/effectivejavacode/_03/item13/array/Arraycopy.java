package com.example.effectivejavacode._03.item13.array;
import java.util.*;
public class Arraycopy {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1.clone();
        arr2[0] = 0;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr1, arr1.length - 1);
        System.out.println(Arrays.toString(arr3));
    }
}
