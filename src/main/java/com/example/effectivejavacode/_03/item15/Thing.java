package com.example.effectivejavacode._03.item15;

/**
 * public 제어자로 final 배열을 반환하면 해당 배열을 직접적으로 변경은 못하지만
 * 참조하고 있는 값은 외부에서 충분히 변경이 가능하다.
 * 그러니 private 제어자로 바꾸고 해당 뷰를 반환한다.
 */
import java.util.*;
public class Thing {
    private static final SomeThing[] PRIVATE_VALUES = {new SomeThing("A"), new SomeThing("B")};

    /**
     * 근데 이 방식은 매번 PRIVATE_VALUES(배열) -> List -> 불변 리스트
     * 이렇게 2번의 과정을 거쳐서 반환한다.
     */
    public static List<SomeThing> privateValuesAsList(){
        return Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
    }

    /**
     * 방어적 복사
     */
    public static SomeThing[] getPrivateValues(){
        return PRIVATE_VALUES.clone();
    }
}
