package com.example.effectivejavacode._02.item3._03_Singleton_Serialization;
import java.io.Serializable;

public class Singleton3 implements Serializable {
    private static final Singleton3 INSTANCE = new Singleton3();
    transient private int var = 0;
    private Singleton3() {
    }
    public static Singleton3 getInstance(){
        return INSTANCE;
    }
    public void setVar(int var) {
        this.var = var;
    }
    public int getVar() {
        return var;
    }
    protected  Object readResolve(){
        return getInstance();
    }
}
