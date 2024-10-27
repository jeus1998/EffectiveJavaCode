package com.example.effectivejavacode._02.item9;

public class App2 {
    public static void main(String[] args) {
        try (Resource1 resource1 = new Resource1()){
            resource1.doSomething();
            // 명시적으로 close 호출하지 않아도 호출
        }
    }
}
