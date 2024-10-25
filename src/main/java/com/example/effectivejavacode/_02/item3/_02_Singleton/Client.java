package com.example.effectivejavacode._02.item3._02_Singleton;

import java.util.function.Supplier;

public class Client {
    public static void main(String[] args) {
        // 정책(싱글톤 or not 싱글톤)이 바뀌어도 API 동일하다.
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();

        // 장점3 정적 팩토리의 메소드 참조를 supplier 사용할 수 있다.
        Supplier<Singleton2> supplier = Singleton2::getInstance;

    }
}
