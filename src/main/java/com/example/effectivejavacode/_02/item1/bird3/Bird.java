package com.example.effectivejavacode._02.item1.bird3;

/**
 * 자바8 기능
 */
public interface Bird {
    static FlyBirds createFlyBird(){
        return new Eagle();
    }
    static FlyBirds createFlyBird(String type){
        if(type == null || type.isBlank()){
            return createFlyBird();
        }

        if("eagle".equalsIgnoreCase(type)){
            return new Eagle();
        }
        else if("sparrow".equalsIgnoreCase(type)){
            return new Sparrow();
        }
        throw new IllegalArgumentException("Invalid bird type: " + type);
    }
    static NonFlyBirds createNonFlyBird() {
        return new Penguin();
    }
}
