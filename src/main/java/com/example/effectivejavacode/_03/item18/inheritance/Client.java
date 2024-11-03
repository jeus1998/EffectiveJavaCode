package com.example.effectivejavacode._03.item18.inheritance;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        InstrumentedHashSet<Integer> set = new InstrumentedHashSet<>();
        set.addAll(List.of(1, 2, 3));
        System.out.println(set.getAddCount()); // 6
    }
}
