package com.example.effectivejavacode._02.item3._01_Singleton;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        // Singleton1 singleton1 = new Singleton1(); 인스턴스 생성 불가
        Singleton1 instance1 = Singleton1.INSTANCE;
        Singleton1 instance2 = Singleton1.INSTANCE;
        System.out.println(instance1 == instance2); // true

        System.out.println(Singleton1.getCount());

        // 리플렉션을 사용한 인스턴스 만들기
        Singleton1 instance3 = null;
        Constructor<?>[] constructors = Singleton1.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            try {
                constructor.setAccessible(true);
                // instance3 = (Singleton1) constructor.newInstance();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println(instance1 != instance3); // true
    }
}
