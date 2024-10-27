package com.example.effectivejavacode._02.item9;

public class App {
    public static void main(String[] args) {
        Resource1 resource1 = new Resource1();
        try {
            resource1.doSomething();
            Resource2 resource2 = null;
            try {
                resource2 = new Resource2();
                resource2.doSomething();
            }
            finally {
                if(resource2 != null){
                    resource2.close();
                }
            }
        }
        finally {
            resource1.close();
        }
    }
}
