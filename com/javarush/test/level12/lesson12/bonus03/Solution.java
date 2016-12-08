package com.javarush.test.level12.lesson12.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array)
    {
        if (array == null || array.length == 0)
        {
            return new Pair<Integer, Integer>(null, null);
        }
        HashMap<Integer, Integer> result = new HashMap<>();//записал в карту порядковый номер и соотв ему элемент массива
        for(int i = 0; i < array.length; i++)
        {
            result.put(i,array[i]);
        }
        for(int i = array.length-1 ; i > 0 ; i--)//отсортировал массив пузырьковым методом
        {
            for (int j = 0; j < i; j++)
            {
                if (array[j] > array[j + 1])
                {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        Set<Map.Entry<Integer,Integer>> entrySet=result.entrySet();//возвращаем набор всех элементов коллекции
        int min = array[0];
        int index = 0;
        for (Map.Entry<Integer,Integer> pair : entrySet) {//по минимальному значению находим индекс
            if (min==pair.getValue()) {
                index = pair.getKey();
            }
        }

        return new Pair<Integer, Integer>(min, index);
    }


    public static class Pair<X, Y>
    {
        public X x;
        public Y y;

        public Pair(X x, Y y)
        {
            this.x = x;
            this.y = y;
        }
    }
}
