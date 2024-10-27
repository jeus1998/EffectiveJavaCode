package com.example.effectivejavacode._02.item8._02_autocloseable;

public class Resource implements AutoCloseable{
    @Override
    public void close() throws RuntimeException{
        System.out.println("close");
    }
    public void hello() {
        System.out.println("hello");
    }
}
