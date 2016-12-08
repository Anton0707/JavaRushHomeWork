package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        int charCount = 0;
        int b;

        FileReader is = new FileReader(fileName);
        while ((b = is.read()) != -1)
        {
            if (((char) b > 64 && (char) b < 91) || ((char) b > 96 && (char) b < 123))
                charCount++;
        }
        is.close();
        System.out.print(charCount);
    }
}