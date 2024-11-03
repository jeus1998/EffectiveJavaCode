package com.example.effectivejavacode._03.item13.deepcopy;
public class Client {
    public static void main(String[] args) {
        A a = new A(new B("A"));
        A copy = a.copy();

        System.out.println(a.getB().getValue());   // A
        System.out.println(a != copy); // true

        copy.getB().setValue("B");

        System.out.println(a.getB().getValue());    // A
        System.out.println(copy.getB().getValue()); // B
    }
}
