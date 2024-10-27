package com.example.effectivejavacode._02.item7._01_memoryleak;

import lombok.ToString;

import java.util.Arrays;
import java.util.EmptyStackException;

// 2장: 7-1
public class Stack<E> {
    public Object [] elements;
    private int index = 0; // size -> index
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack (){
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(E e){
        ensureCapacity();
        elements[index++] = e;
    }
    public E pop(){
        if(index == 0){
            throw new EmptyStackException();
        }
        Object value = elements[--index];
        elements[index] = null;
        return (E) value;
    }
    private void ensureCapacity(){
        if(elements.length == index){
            elements = Arrays.copyOf(elements, 2 * index + 1);
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i = index - 1; i >=0; i--){
            sb.append(elements[i]);
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }
}
