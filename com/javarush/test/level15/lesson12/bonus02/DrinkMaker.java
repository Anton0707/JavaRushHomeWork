package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by admin on 8/21/16.
 */
abstract public class DrinkMaker {
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();
    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();
    }
}
