package com.example.effectivejavacode._02.item1.bird1;

/**
 * Bird 하위 타입 인스턴스를 만드는 유틸성 클래스
 * Java8: 인터페이스에 static method 사용 가능
 * java9: 인터페이스에 private static method 사용 가능
 */
public class Birds {
    private Birds () {}

    /**
     * can fly bird 반환하는 정적 팩토리 메소드
     * return Eagle
     */
    public static FlyBirds flyBird(){
        return new Eagle();
    }
    /**
     * cant fly bird 반환하는 정적 팩토리 메소드
     * return Penguin
     */
    public static NonFlyBirds nonFlyBirds(){
        return new Penguin();
    }

}
