package com.example.effectivejavacode._03.item13.shallowcopy;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class B {
    private String value;
    public B(String value) {
        this.value = value;
    }
}
