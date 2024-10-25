package com.example.effectivejavacode._02.item3._03_Singleton_Serialization;
import java.io.*;
public class Client {
    public static void main(String[] args) {
        Singleton3 instance1 = Singleton3.getInstance();
        instance1.setVar(10);

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton"))){
            out.writeObject(instance1);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        Singleton3 instance2 = null;
        try(ObjectInput in = new ObjectInputStream(new FileInputStream("singleton"))) {
            instance2 = (Singleton3) in.readObject();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(instance1 != instance2);

    }
}
