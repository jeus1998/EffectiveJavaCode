package com.example.effectivejavacode._02.item2._04_hierarchicalbuilder;

import lombok.ToString;

import java.util.*;
/**
 * 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴
 */
abstract public class Pizza {
    public enum Topping { // Pizza Toppings
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }
    final Set<Topping> toppings;
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping){
            toppings.add(topping);
            return self(); // return T (this)
        }
        abstract Pizza build();
        protected abstract T self(); // this 반환하도록 구현
    }
    /**
     * EnumSet implements Cloneable
     */
    Pizza(Builder<?> builder){
        toppings = builder.toppings.clone();
    }
}
