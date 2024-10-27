package com.example.effectivejavacode._02.item8._01_finalizer;

public class SampleRunner {
    public static void main(String[] args) throws InterruptedException {
        SampleRunner runner = new SampleRunner();
        runner.run();
    }
    private void run() {
        FinalizerExample example = new FinalizerExample();
        example.hello();
        // 어디에서도 참조x -> GC 대상
    }
}
