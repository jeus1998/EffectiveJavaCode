package com.example.effectivejavacode._02.item3._04_Singleton;

import java.io.*;
import java.lang.reflect.Constructor;
public class Client {
    public static void main(String[] args) {
        Singleton4 instance1 = Singleton4.INSTANCE;
        Singleton4 instance2 = null;

        // 리플렉션 불가능
        Constructor<?>[] constructors = Singleton4.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            try {
                constructor.setAccessible(true);
                instance2 = (Singleton4) constructor.newInstance();
            }
            catch (Exception e){
                e.printStackTrace();
                // java.lang.IllegalArgumentException: Cannot reflectively create enum objects
            }
        }
        System.out.println(instance2 == null); // true

        // 직렬화에 안전
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton"))) {
            out.writeObject(instance1);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        Singleton4 instance3 = null;
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("singleton"))) {
           instance3 = (Singleton4) in.readObject();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(instance1 == instance3);
    }
}
