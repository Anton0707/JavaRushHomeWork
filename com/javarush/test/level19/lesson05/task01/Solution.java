package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileReader = new FileInputStream(reader.readLine());
        FileOutputStream fileWriter = new FileOutputStream(reader.readLine());
        while (fileReader.available()>0)
        {
                int data1 = fileReader.read();
                int data2 = fileReader.read();
                fileWriter.write(data2);
        }
        fileReader.close();
        fileWriter.close();
    }
}
