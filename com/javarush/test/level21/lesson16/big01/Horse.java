package com.javarush.test.level21.lesson16.big01;

/**
 * Created by admin on 9/8/16.
 */
public class Horse {
    String name;
    double speed;
    double distance;
    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }
    public String getName(){
        return this.name;
    }
    public double getSpeed(){
        return this.speed;
    }
    public double getDistance(){
        return this.distance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSpeed(double speed){
        this.speed = speed;
    }
    public void setDistance(double distance){
        this.distance = distance;
    }
    public void move(){
        distance += speed * Math.random();
    }
    public void print(){
        String point = "";
        int n = (int)getDistance();
        for (int i = 0; i < n; i++){
            point += ".";
        }
        System.out.println(point + getName());
    }
}
