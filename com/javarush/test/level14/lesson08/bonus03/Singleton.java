package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by admin on 8/21/16.
 */
public class Singleton {
    private Singleton(){

    }
    private static Singleton instance = null;
    public static Singleton getInstance(){
        if(instance== null){
            instance = new Singleton();
        }
        return instance;
    }

}
