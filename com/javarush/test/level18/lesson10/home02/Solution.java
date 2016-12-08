package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException{
        String filename = args[0];
        int countSpace = 0;
        int count = 0;
        int b;
        FileReader is = new FileReader(filename);
        while ((b = is.read()) != -1){
            count++;
            if((char)b == 32)
                countSpace++;
        }
        float result = (float) ((float)countSpace/count*100.0);

        System.out.println(String.format(Locale.ENGLISH, "%.2f", result));
        is.close();
    }
}
