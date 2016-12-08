package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        int b;
        String x = "";
        String s = "";
        while ((b =fileReader.read()) != -1)
        {
            s += (char)b;
        }
        String arr[] = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length;i++)
        {
            list.add(arr[i]);
        }
        Pattern p = Pattern.compile("\\d+");
        for (int i = 0; i < list.size();i++)
        {

            Matcher m = p.matcher(list.get(i));
            if(!m.matches())
            {
                list.remove(list.get(i));
                i--;
            }
        }
        for (String y: list)
        {
            fileWriter.write(y + " ");
        }
        fileReader.close();
        fileWriter.close();
    }
}
