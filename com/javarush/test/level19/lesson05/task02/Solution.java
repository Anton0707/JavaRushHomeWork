package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        reader.close();
        int b;
        int count = 0;
        String s = "";
        while ((b = fileReader.read()) != -1){
            s += (char)b;
        }
        String str[] = s.split("[,;:.!?\\s]+");
        s = s.replaceAll("\\p{P}", "");
        for (String x: str)
        {
            if(x.toLowerCase().equals("world"))
                count++;
        }
        System.out.println(count);
        fileReader.close();
    }
}
