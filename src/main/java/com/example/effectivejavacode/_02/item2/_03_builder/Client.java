package com.example.effectivejavacode._02.item2._03_builder;

public class Client {
    public static void main(String[] args) {
        NutritionFacts cocaColaNutritionFacts = new NutritionFacts.Builder(240, 8) // 필수 값
                .calories(100).sodium(35).carbohydrate(27).build();
    }
}
