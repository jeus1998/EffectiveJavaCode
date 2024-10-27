package com.example.effectivejavacode._02.item8._01_finalizer;

public class FinalizerExample {
    /**
     * GC 대상이 아닌 GC가 처리할 때 해당 메소드(finalize())를 호출한다.
     * GC 대상이 된다고 해서 바로 GC가 처리하지 않는다.
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Clean Up");
    }
    public void hello() {
        System.out.println("hello");
    }
}
