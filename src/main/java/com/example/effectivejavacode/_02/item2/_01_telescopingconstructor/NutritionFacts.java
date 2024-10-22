package com.example.effectivejavacode._02.item2._01_telescopingconstructor;

/**
 * 식품 포장 영양 정보를 표현하는 클래스
 */
public class NutritionFacts {
    private final int servingSize;  // (mL, 1회 제공량)     필수
    private final int servings;     // (회, 총 n회 제공량)   필수
    private final int calories;     // (1회 제공량당)       선택
    private final int fat;          // (g/1회 제공량)       선택
    private final int sodium;       // (mg/1회 제공량)      선택
    private final int carbohydrate; // (g/1회 제공량)       선택

    public NutritionFacts(int servingSize, int servings){
        this(servingSize, servings, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories) {
         this(servingSize, servings, calories, 0, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
       this(servingSize, servings, calories, fat, sodium, 0);
    }
    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts(240, 8);
    }
}
