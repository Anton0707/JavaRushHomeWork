package com.javarush.test.level27.lesson15.big01;
import com.javarush.test.level27.lesson15.big01.kitchen.Order;

/**
 * Created by admin on 10/16/16.
 */
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet {
    private java.util.logging.Logger logger = Logger.getLogger(Tablet.class.getName());
    final int number;
    public Tablet(int number){
        this.number = number;
    }
    public void createOrder(){
        try {
            final Order newOrder = new Order(this);
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return;
        }
    }
}
