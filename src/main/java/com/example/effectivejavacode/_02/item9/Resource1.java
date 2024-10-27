package com.example.effectivejavacode._02.item9;

public class Resource1 implements AutoCloseable{
    @Override
    public void close() {
        System.out.println("Resource1 close");
        throw new RuntimeException("Resource1 close Exception");
    }
    public void doSomething(){
        System.out.println("Resource1 Do Something");
        throw new RuntimeException("Resource1 Do Something Exception");
    }
}
