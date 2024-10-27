package com.example.effectivejavacode._02.item6;

public class AutoBoxing {
    public static void main(String[] args) {
        long start = System.nanoTime();
        long sum = 0L;
        for(long i = 0; i <= Integer.MAX_VALUE; i++){
            sum += i; // Boxing 타입인 Long 타입으로 기본 타입인 long 오토박싱 해서 더한다.
        }
        System.out.println(sum);
        System.out.println(System.nanoTime() - start);
        // Long = 1430368600 long = 1432918600 ??? 더 느리네?
    }
}
