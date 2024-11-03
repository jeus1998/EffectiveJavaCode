package com.example.effectivejavacode._03.item14;

import java.util.Comparator;
import static java.util.Comparator.comparingInt;

public class People implements Comparable<People>{
    public static Comparator<People> AGE_ASC = comparingInt((People p) -> p.age);
    public static Comparator<People> HEIGHT_ASC = comparingInt((People p) -> p.height);
    public static Comparator<People> AGE_ASC_HEIGHT_ASC = comparingInt((People p) -> p.age)
            .thenComparingInt((People p) -> p.height);
    public static Comparator<People> COMPARATOR = (o1, o2) -> {
        if(o1.age != o2.age) return o1.age - o2.age;
        return o1.height - o2.age;
    };

    static enum Sex{
        M, W
    }
    private int age;
    private Sex sex;
    private int height;
    @Override
    public int compareTo(People p) {
        return AGE_ASC.compare(this, p);
    }
}
