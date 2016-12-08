package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }
    static Double f(Double a, Double b) {
        if ((a == null) || (b == 1.0)) {
            throw new IllegalArgumentException();
        }
        return a / b;
    }
    static Double g(Double a, Double b) {
        if ((a == null) || (b == 2.0)) {
            throw new SecurityException();
        }
        return a / b;
    }
    static Double h(Double a, Double b) {
        if ((a == null) || (b == 3.0)) {
            throw new ClassCastException();
        }
        return a / b;
    }


    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            int a[] = new int[2];
            a[3] = 1;
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            byte a[] = new byte[-2];
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < 5; i++)
            {
                list.add(i);
            }
            list.remove(list.get(2));
            int b = 0;
            for (int i = 0; i < 5; i++)
            {
                b += list.get(i);
            }
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            String s = "dvnj";
            s.charAt(5);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            String s = "dvnj";
            s.compareTo(null);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            String s = "dvnj";
            int c = Integer.parseInt(s);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            f(0.0,1.0);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            g(0.0,2.0);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try{
            h(0.0,3.0);
        }catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here

    }
}
