package com.example.effectivejavacode._02.item8._03_safetynet;

public class Resource implements AutoCloseable{
    private boolean closed;
    @Override
    public void close() throws RuntimeException{
        if(closed){
            throw new IllegalStateException();
        }
        closed = true;
        System.out.println("close");
    }
    @Override
    protected void finalize() throws Throwable {
        if(!closed) close();
    }
    public void hello() {
        System.out.println("hello");
    }
}
