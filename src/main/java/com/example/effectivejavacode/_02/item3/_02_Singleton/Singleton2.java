package com.example.effectivejavacode._02.item3._02_Singleton;

public class Singleton2 {
    private static final Singleton2 INSTANCE = new Singleton2();
    private Singleton2(){
    }
    public static Singleton2 getInstance(){
        return INSTANCE;
        // return new Singleton2();
    }
}
