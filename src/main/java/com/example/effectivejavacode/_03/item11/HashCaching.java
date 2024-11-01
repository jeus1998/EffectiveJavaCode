package com.example.effectivejavacode._03.item11;

public class HashCaching {
    private final int a;
    private final int b;
    private int hashCode;
    // equals 메소드 생략
    public HashCaching(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0){
            synchronized (this){
                result = hashCode;
                if(result == 0){
                    result = Integer.hashCode(a);
                    result = result * 31 + Integer.hashCode(b);
                }
            }
        }
        return result;
    }
}
