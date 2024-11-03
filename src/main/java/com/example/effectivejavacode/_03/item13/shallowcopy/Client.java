package com.example.effectivejavacode._03.item13.shallowcopy;

public class Client {
    public static void main(String[] args) {
        A a = new A(new B("A"));
        System.out.println(a.getB().getValue()); // A
        A clone = (A) a.clone(); // Shallow Copy
        System.out.println(a == clone);
        clone.getB().setValue("B");

        System.out.println(a.getB().getValue()); // A -> B 바뀐다.
    }
}
