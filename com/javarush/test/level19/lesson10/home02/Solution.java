package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String filename = args[0];
        Map<String, Double> map = new HashMap<>();
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = null;
        try{
            sc = new Scanner(new FileReader(filename));
        }catch (FileNotFoundException e){

        }
        while (sc.hasNextLine()){
            String [] temp = sc.nextLine().split(" ");
            if(map.containsKey(temp[0])){
                double val = map.get(temp[0]) + Double.parseDouble(temp[1]);
                map.put(temp[0], val);
            }
            else {
                map.put(temp[0], Double.parseDouble(temp[1]));
            }
        }
        for(Map.Entry<String, Double> entry: map.entrySet()){
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for(Map.Entry<String, Double> entry: map.entrySet()){
            if(list.get(list.size()-1).equals(entry.getValue())){
                System.out.println(entry.getKey());
            }
        }
        sc.close();
    }
}
