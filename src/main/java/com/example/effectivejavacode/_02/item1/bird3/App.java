package com.example.effectivejavacode._02.item1.bird3;

public class App {
    public static void main(String[] args) {
        Eagle eagle = (Eagle) Bird.createFlyBird();
        Eagle eagle2 = (Eagle) Bird.createFlyBird("eaGLE");
        Sparrow sparrow = (Sparrow) Bird.createFlyBird("sparrow");
        Eagle eagle3 = (Eagle) Bird.createFlyBird(null);

        System.out.println(eagle.getClass());
        System.out.println(eagle2.getClass());
        System.out.println(sparrow.getClass());
        System.out.println(eagle3.getClass());

        try {
            Bird.createFlyBird("unknown");
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage()); // 출력: Invalid bird type: unknown
        }
    }
}
