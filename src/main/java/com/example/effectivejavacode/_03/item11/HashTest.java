package com.example.effectivejavacode._03.item11;

public class HashTest {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        System.out.println(str1.hashCode() + " " + str2.hashCode());

        String str3 = String.valueOf("hello");
        System.out.println(str3.hashCode());
    }
}
