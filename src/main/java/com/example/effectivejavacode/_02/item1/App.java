package com.example.effectivejavacode._02.item1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.JDBCType;

public class App {
    public static void main(String[] args) {
        // Constant Pool 캐싱된 값 반환
        Boolean b = Boolean.valueOf(true);
        // 별도의 설정이 없으면 -128 ~ 127 사이면 캐싱된 값 아니면 new Integer
        Integer num = Integer.valueOf(10);

        Person person1 = new Person("배제우", 12);
        Person person2 = Person.personWithNameAndAge("배제우", 12);

        try {
            // 어떠한 DriverManager 구현체가 존재 x
            // gradle or maven 통한 구현체(.jar) 주입
            // 해당 Driver를 AutoConfiguration 통해서 등록
            Constructor<Driver> constructor = Driver.class.getConstructor();
            Driver driver = constructor.newInstance();
            DriverManager.registerDriver(driver);
            Connection connection = DriverManager.getConnection("url");
        }
        catch (Exception e){
            System.out.println("이해를 위한 학습");
        }
    }
}
