package com.example.effectivejavacode._03.item10._05_collection;

import java.util.*;
import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);

        ArrayList<Integer> list2 = new ArrayList<>();
        IntStream.range(1, 5).forEach(list2::add);

        System.out.println(list1.equals(list2));

        List<Integer> list3 = Collections.unmodifiableList(list2);
        System.out.println(list3);
        System.out.println(list2 == list3); // false
        System.out.println(list2.equals(list3));

        // list3.add(1); --> UnsupportedOperationException
        list2.add(5);
        System.out.println(list3); // 5 추가 원본 리스트 수정으로 같이 바뀐다.
    }
}
