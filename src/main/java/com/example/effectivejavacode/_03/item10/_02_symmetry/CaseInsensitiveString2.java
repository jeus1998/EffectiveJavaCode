package com.example.effectivejavacode._03.item10._02_symmetry;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CaseInsensitiveString2 {
    private final String s;
    public CaseInsensitiveString2(String s) {
        this.s = Objects.requireNonNull(s);
    }
    // 대칭성 위배!
    @Override public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString2 && ((CaseInsensitiveString2) o).s.equalsIgnoreCase(this.s);
    }
    public static void main(String[] args) {
        CaseInsensitiveString2 cis = new CaseInsensitiveString2("Polish");

        List<CaseInsensitiveString2> list = new ArrayList<>();
        list.add(cis);

        CaseInsensitiveString2 cis2 = new CaseInsensitiveString2("polish");
        System.out.println(list.contains(cis2));
    }
}
