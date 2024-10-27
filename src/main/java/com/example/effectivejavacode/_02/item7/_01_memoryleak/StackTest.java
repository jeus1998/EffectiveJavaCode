package com.example.effectivejavacode._02.item7._01_memoryleak;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        IntStream.range(1, 11).forEach(i -> stack.push(i)); // 1 ~ 10
        IntStream.range(1, 5).forEach(i -> stack.pop());    // 10,9,8,7,6 pop
        System.out.println(Arrays.toString(stack.elements));
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null, null, null, null]
    }
}
