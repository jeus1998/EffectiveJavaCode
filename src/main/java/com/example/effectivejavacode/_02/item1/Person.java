package com.example.effectivejavacode._02.item1;

public class Person {
    private String name;
    private String address;
    private int age;
    private Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    private Person(int age) {
        this.age = age;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 정적 팩터리 메소드
    public static Person personWithName(String name){
        Person person = new Person();
        person.name = name;
        return person;
    }
    public static Person personWithAddress(String address){
        Person person = new Person();
        person.address = address;
        return person;
    }



    public static Person personWithAge(int age){
        return new Person(age);
    }
    public static Person personWithNameAndAge(String name, int age){
        return new Person(name, age);
    }
}
