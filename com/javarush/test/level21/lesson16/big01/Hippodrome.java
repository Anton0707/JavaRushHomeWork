package com.javarush.test.level21.lesson16.big01;


import java.util.ArrayList;

/**
 * Created by admin on 9/8/16.
 */
public class Hippodrome {
    public static Hippodrome game;
    ArrayList<Horse> horses = new ArrayList<>();
    public ArrayList<Horse> getHorses()
    {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException
    {
        game = new Hippodrome();
        Horse horse1 = new Horse("Horse1", 3, 0);
        Horse horse2 = new Horse("Horse2", 3, 0);
        Horse horse3 = new Horse("Horse3", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        game.run();
        game.printWinner();
    }
    public void run() throws InterruptedException{
        for (int i = 0; i < 100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move(){
        for(Horse currentHorse: horses){
            currentHorse.move();
        }
    }
    public void print(){
        for(Horse currentHorse: horses){
            currentHorse.print();
        }
        System.out.println();
        System.out.println();
    }
    public Horse getWinner(){
       Horse winner  = horses.get(0);
        for(Horse currentHorse: horses){
            if(currentHorse.getDistance() > winner.getDistance()){
                winner = currentHorse;
            }
        }
        return winner;
    }
    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
