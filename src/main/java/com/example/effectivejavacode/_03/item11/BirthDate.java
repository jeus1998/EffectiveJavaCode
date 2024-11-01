package com.example.effectivejavacode._03.item11;

import java.util.*;
public class BirthDate {
    private final int year;
    private final int month;
    private final int day;
    // 범위 검사는 pass 하겠다.
    public BirthDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof BirthDate)) return false;
        BirthDate bd = (BirthDate) o;
        return bd.year == year && bd.month == month && bd.day == day;
    }
    @Override
    public int hashCode() {
        Objects.hash(year, month, day);

        // 첫 번째 필드의 해시코드를 result 저장
        int result = Integer.hashCode(year);
        result = result * 31 + Integer.hashCode(month);
        result = result * 31 + Integer.hashCode(day);
        return result;
    }
    public static void main(String[] args) {
        BirthDate birthDate1 = new BirthDate(1998, 12, 12);
        BirthDate birthDate2 = new BirthDate(2024, 11, 1);

        Set<BirthDate> set = new HashSet<>();
        set.add(birthDate1);

        System.out.println(set.contains(new BirthDate(1998, 12, 12))); // true
        System.out.println(set.contains(birthDate2)); // false
    }
}
