package com.example.effectivejavacode._02.item3._01_Singleton;

public class Singleton1 {
    public static final Singleton1 INSTANCE = new Singleton1();
    private static int count;
    public static int getCount(){
        return count;
    }
    private Singleton1(){
        count++;
        if(count > 1){
            throw new IllegalStateException("this object should be singleton");
        }
    }
}
/*

private static boolean FLAG = false;
private Singleton1(){
    System.out.println(FLAG);
    if(FLAG){
        throw new IllegalStateException("this object should be singleton");
    }
}
static {
    FLAG = true;
}
 */