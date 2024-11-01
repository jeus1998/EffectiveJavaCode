package com.example.effectivejavacode._03.item12;

import java.util.Objects;
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

    /**
     * 생년월일을 반환한다.
     * 이 설명의 일반적인 형태나 상세 형식은 정해지지 않았다.
     * ex) BirthDate{1998:12:12}
     */
    @Override
    public String toString() {
        return "BirthDate{" + year + ":" + month + ":" + day + "}";
    }
    @Override
    public boolean equals(Object o) {
        if(!(o instanceof BirthDate)) return false;
        BirthDate bd = (BirthDate) o;
        return bd.year == year && bd.month == month && bd.day == day;
    }
    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
    public static void main(String[] args) {
        BirthDate birthDate = new BirthDate(1998, 12, 12);
        System.out.println(birthDate);
    }
}
