package com.example.effectivejavacode._02.item2._02_jababeans;

import lombok.Setter;

/**
 * 식품 포장 영양 정보를 표현하는 클래스
 * 자바빈즈 패턴 - 일관성이 깨지고 불변으로 만들 수 없다.
 */
@Setter
public class NutritionFacts {
    private int servingSize;
    private int servings;
    private int calories;
    private int fat;
    private int sodium;
    private int carbohydrate;
    public NutritionFacts() {}

    public static void main(String[] args) {
        NutritionFacts cola = new NutritionFacts();
        cola.setServingSize(240);
        cola.setServings(8);
        cola.setCalories(100);
        cola.setSodium(35);
    }
}
