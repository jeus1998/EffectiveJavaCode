package com.example.effectivejavacode._02.item8._02_autocloseable;
public class SampleRunner {
    public static void main(String[] args) throws InterruptedException {
        SampleRunner runner = new SampleRunner();
        runner.run();
    }
    private void run() {
        // try-with-resource
        try(var resource = new Resource()) {
            resource.hello();
        }
    }
}
