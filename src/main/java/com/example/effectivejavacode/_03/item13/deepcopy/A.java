package com.example.effectivejavacode._03.item13.deepcopy;

import lombok.Getter;

@Getter
public class A {
    private B b;
    public A(B b) {
        this.b = b;
    }
    public A copy(){
       return new A (new B(this.b.getValue()));
    }
}
