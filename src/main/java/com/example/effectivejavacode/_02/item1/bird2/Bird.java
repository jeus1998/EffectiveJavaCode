package com.example.effectivejavacode._02.item1.bird2;

/**
 * 자바8 기능
 */
public interface Bird {
    static FlyBirds createFlyBird(){
        return new Eagle();
    }
    static NonFlyBirds createNonFlyBird() {
        return new Penguin();
    }
}
