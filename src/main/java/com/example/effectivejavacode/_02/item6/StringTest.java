package com.example.effectivejavacode._02.item6;

public class StringTest {
    public static void main(String[] args) {
        String name1 = "jeu";
        String name2 = "jeu";
        System.out.println(name1 == name2); // true

        String str1 = new String("jeu");
        String str2 = new String("jeu");

        System.out.println(str1 != str2);  // true
        System.out.println(name1 != str1); // true
    }
}
