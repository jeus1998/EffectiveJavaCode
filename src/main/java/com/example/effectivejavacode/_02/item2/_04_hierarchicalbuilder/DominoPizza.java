package com.example.effectivejavacode._02.item2._04_hierarchicalbuilder;

// 도미노피자 - 계층적 빌더를 활용한 하위 클래스
public class DominoPizza extends Pizza{
    private final boolean sauceInside;
    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInside = false; // 기본값
        public Builder sauceInside(){
            this.sauceInside = true;
            return this;
        }
        @Override
        public DominoPizza build() {
            return new DominoPizza(this);
        }
        @Override
        protected Builder self() {
            return this;
        }
    }
    private DominoPizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
    @Override
    public String toString(){
        return "toppings: " + toppings.toString() + " sauceInside: " + sauceInside;
    }
}
