package com.example.effectivejavacode._03.item18.composition;

import lombok.Getter;

import java.util.Collection;
import java.util.*;

/**
 * 데코레이터 패턴 적용된 InstrumentedHashSet
 */

@Getter
public class InstrumentedHashSet<E> extends ForwardingSet<E> {
    private int addCount = 0;
    public InstrumentedHashSet(Set<E> set) {
        super(set);
    }
    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }
    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }
}
