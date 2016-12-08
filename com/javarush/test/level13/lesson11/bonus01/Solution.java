package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.io.File;
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        List<Integer> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        BufferedReader reader1 = new BufferedReader(new FileReader(inputFile)); // чтение с файла
        String line = null;
        while((line = reader1.readLine()) != null)
        {
            if(isNumber(line)  && (Integer.parseInt(line) % 2 == 0)) //проверка что строка является числом и делится на 2
            {
                list.add(Integer.parseInt(line));
            }
        }

        Collections.sort(list, new Comparator<Integer>()
        {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }  //сортировка
        );

        for(int j = 0; j < list.size(); j++)
            System.out.println(list.get(j));

    }
    public static boolean isNumber(String line) {
        if (line == null || line.isEmpty()) return false;
        for (int i = 0; i < line.length(); i++) {
            if (!Character.isDigit(line.charAt(i))) return false;
        }
        return true;
    }
}

