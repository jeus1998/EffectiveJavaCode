package com.example.effectivejavacode._02.item7._02_cache;

import java.util.*;
public class WeekHashMapCache {
    public static void main(String[] args) throws Exception {
        WeakHashMap<String, String> cache = new WeakHashMap<>();
        String key = new String("test_key");
        String value = new String("test_value");
        cache.put(key, value);

        key = null; // 참조 제거 Strong Reference
        Thread thread = new Thread(() -> {
           System.gc(); // 가비지 컬렉션 호출
        });
        thread.start();

        thread.join();
        System.out.println(cache); // {}
    }
}
