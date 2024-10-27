package com.example.effectivejavacode._02.item8._04_cleaner;
import java.lang.ref.Cleaner;
public class Resource implements AutoCloseable{
    private boolean closed;
    private static final Cleaner CLEANER = Cleaner.create();
    private final Cleaner.Cleanable cleanable;
    private final ResourceCleaner resourceCleaner;
    public Resource() {
        this.resourceCleaner = new ResourceCleaner(); // 스레드 생성
        this.cleanable = CLEANER.register(this, resourceCleaner);
    }
    // Cleaner: 별도의 스레드가 필요
    private static class ResourceCleaner implements Runnable{
        @Override
        public void run() {
            // TODO: 자원 반납
            System.out.println("Clean");
        }
    }
    @Override
    public void close() throws RuntimeException{
        if(closed){
            throw new IllegalStateException();
        }
        closed = true;
        System.out.println("close");
        cleanable.clean();
    }
    public void hello() {
        System.out.println("hello");
    }
}
