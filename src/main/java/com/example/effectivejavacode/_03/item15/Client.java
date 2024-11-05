package com.example.effectivejavacode._03.item15;

public class Client {
    public static void main(String[] args) {
        B b = new B(1, 2);
        A a = new A(b);
        b.value1 = 2;
        b.value2 = 3;


    }
}
