package com.example.effectivejavacode._03.item11;

import java.util.HashSet;
import java.util.*;
public class ObjectExample {
    private final int a;
    public ObjectExample(int a) {
        this.a = a;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof ObjectExample){
            return ((ObjectExample) o).a == this.a;
        }
        return false;
    }
    @Override
    public int hashCode() {
        return 42;
    }
    public static void main(String[] args) {
        ObjectExample t1 = new ObjectExample(1);
        ObjectExample t2 = new ObjectExample(1);
        ObjectExample t3 = new ObjectExample(2);

        Set<ObjectExample> set = new HashSet<>();

        set.add(t1);
        System.out.println(set.contains(t1)); // true
        System.out.println(set.contains(t2)); // true
        System.out.println(set.contains(t3)); // false
    }
}
