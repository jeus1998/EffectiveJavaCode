package com.example.effectivejavacode._02.item9;

public class Resource2 implements AutoCloseable{
    @Override
    public void close(){
        System.out.println("Resource2 close");
        throw new RuntimeException("Resource2 close Exception");
    }
    public void doSomething(){
        System.out.println("Resource2 Do Something");
        throw new RuntimeException("Resource2 Do Something Exception");
    }
}
