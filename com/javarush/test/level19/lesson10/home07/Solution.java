package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader filereader = new BufferedReader(new FileReader(args[0]));
        PrintWriter printWriter = new PrintWriter(new FileWriter(args[1]));
        String a = "";
        String d = "";
        while ((a = filereader.readLine()) != null){
            String [] b = a.split(" ");
            for (String c: b){
                if(c.length() > 6)
                    d += (c + ",");
            }
        }
        String e = d.substring(0, d.length()-1);
        printWriter.print(e);
        filereader.close();
        printWriter.close();
    }
}
