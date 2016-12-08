package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        FileReader reader2 = new FileReader(name2);
        FileReader reader3 = new FileReader(name3);
        FileWriter writer1 = new FileWriter(name1);
        int b,c;
        while ((b = reader2.read()) != -1){
            writer1.write((char)b);
        }
        while ((c = reader3.read()) != -1){
            writer1.write((char)c);
        }
        reader.close();
        reader2.close();
        reader3.close();
        writer1.close();
    }
}
