package com.example.effectivejavacode._02.item2._04_hierarchicalbuilder;

import lombok.ToString;

public class PizzaHut extends Pizza {
    public enum Size{
        SMALL, MEDIUM, LARGE
    }
    private final Size size;
    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        public Builder(Size size) {
            this.size = size;
        }
        @Override
        PizzaHut build() {
            return new PizzaHut(this);
        }
        @Override
        protected Builder self() {
            return this;
        }
    }
    private PizzaHut(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
