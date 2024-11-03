package com.example.effectivejavacode._03.item13.shallowcopy;

import lombok.Getter;

@Getter
public class A implements Cloneable{
    private B b;
    public A(B b) {
        this.b = b;
    }
    @Override
    protected Object clone(){
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e){
            throw new IllegalArgumentException(e);
        }
    }
}
