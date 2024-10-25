package com.example.effectivejavacode._02.item2._04_hierarchicalbuilder;

public class PizzaCustomer {
    public static void main(String[] args) {
        DominoPizza dominoPizza = new DominoPizza.Builder().addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.SAUSAGE)
                .sauceInside().build();

        System.out.println(dominoPizza);

    }
}
