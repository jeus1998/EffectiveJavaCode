package com.example.effectivejavacode._03.item10._01_SetEquals;

import java.util.HashSet;
import java.util.Set;

/*
이펙티브 자바 페이지 52
상위 클래스에서 재정의한 equals가 하위 클래스에도 딱 맞는 경우

Set 구현체는 AbstractSet 구현한
equals 메소드를 상속 받아서 사용한다.

구현 내용
- 만약 참조가 같으면 ( this == o ) return true
- Set 하위 타입이 아니면 return false
- 사이즈가 다르면 return false
- containsAll(o) !this.contains(E) return false
- 타입 캐스팅 실패 or nullPointerException 발생 시 return false
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);

        System.out.println(set1.equals(set2));
    }
}
