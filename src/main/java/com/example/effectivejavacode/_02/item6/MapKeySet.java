package com.example.effectivejavacode._02.item6;

import java.util.*;
public class MapKeySet {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("jeu", 5);
        people.put("zeus", 8);

        Set<String> names1 = people.keySet();
        Set<String> names2 = people.keySet();

        names1.remove("jeu");

        System.out.println(names1 == names2);
        System.out.println(people.size()); // 1
        System.out.println(names1.size()); // 1
        System.out.println(names2.size()); // 1
    }
}
