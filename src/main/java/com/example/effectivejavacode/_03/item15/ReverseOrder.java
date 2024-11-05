package com.example.effectivejavacode._03.item15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseOrder {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        integers.sort(Collections.reverseOrder());
        System.out.println(integers); // 5, 4, 3, 2, 1
        integers.sort(Collections.reverseOrder().reversed());
        System.out.println(integers); // 1, 2, 3, 4, 5
    }
}
