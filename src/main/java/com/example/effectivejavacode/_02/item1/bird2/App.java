package com.example.effectivejavacode._02.item1.bird2;

public class App {
    public static void main(String[] args) {
        Eagle eagle = (Eagle)Bird.createFlyBird();
        Penguin penguin = (Penguin) Bird.createNonFlyBird();
    }
}
