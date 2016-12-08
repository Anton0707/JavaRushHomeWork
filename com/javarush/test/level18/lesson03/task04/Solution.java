package com.javarush.test.level18.lesson03.task04;

import java.io.FileInputStream;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        while (fileInputStream.available() > 0)
        {
            list.add(fileInputStream.read());
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++)
        {
            map.put(list.get(i), map.containsKey(list.get(i)) ? map.get(list.get(i)) + 1 : 1);
        }

        ArrayList<Integer> values = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : map.entrySet())
        {
            values.add(e.getValue());
        }
        int min = values.get(0);
        for (int i = 0; i < values.size(); i++)
        {
            if (values.get(i) < min)
                min = values.get(i);
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext())
        {
            Map.Entry pair = (Map.Entry) it.next();
            if (pair.getValue().equals(min))
            {
                System.out.println(pair.getKey() + " ");
            }
        }
    }
}


