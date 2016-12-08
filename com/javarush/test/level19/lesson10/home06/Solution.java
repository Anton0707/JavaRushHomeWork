package com.javarush.test.level19.lesson10.home06;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Замена чисел
1. В статическом блоке инициализировать словарь map парами [число-слово] от 0 до 12 включительно
Например, 0 - "ноль", 1 - "один", 2 - "два"
2. Считать с консоли имя файла
3. Заменить все числа на слова используя словарь map
4. Результат вывести на экран
5. Закрыть потоки. Не использовать try-with-resources

Пример данных:
Это стоит 1 бакс, а вот это - 12 .
Переменная имеет имя file1.
110 - это число.

Пример вывода:
Это стоит один бакс, а вот это - двенадцать .
Переменная имеет имя file1.
110 - это число.
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0,"ноль");
        map.put(1,"один");
        map.put(2,"два");
        map.put(3,"три");
        map.put(4,"четыре");
        map.put(5,"пять");
        map.put(6,"шесть");
        map.put(7,"семь");
        map.put(8,"восемь");
        map.put(9,"девять");
        map.put(10,"десять");
        map.put(11,"одиннадцать");
        map.put(12,"двенадцать");
    }

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        ArrayList<String> list = new ArrayList<>();
        String s = "";
        try
        {
            BufferedReader filereader = new BufferedReader(new FileReader(filename));
            while ((s = filereader.readLine()) != null){
                String [] b = s.split(" ");
                String s1 = "";
                for(String a: b){
                    for(Map.Entry<Integer, String> x: map.entrySet()){
                        if(a.equals(x.getKey().toString())){
                            a = x.getValue();
                        }
                    }
                    s1 += (a + " ");
                }
                list.add(s1);
            }
            filereader.close();
        }catch (Exception e){

        }
        for(String v: list)
            System.out.println(v);
    }
}
