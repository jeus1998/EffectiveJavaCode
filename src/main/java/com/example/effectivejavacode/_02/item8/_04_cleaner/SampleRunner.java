package com.example.effectivejavacode._02.item8._04_cleaner;

public class SampleRunner {
    public static void main(String[] args) throws InterruptedException {
        SampleRunner runner = new SampleRunner();
        runner.run();
        System.gc();
    }
    private void run() {
        // 명시적 close() 호출 x & try-catch 블록
        try {
           Resource resource = new Resource();
           resource.hello();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
