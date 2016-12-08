package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(reader1.readLine());
        int max = Integer.parseInt(reader1.readLine());
        System.out.println(nod(min,max));
    }
    public static int nod(int x, int y)
    {
        int c = 1;
        for(int i = 1; i <= (x < y ? x : y); i++)
        {
            if (x % i ==0 && y % i ==0)
                c = i;
        }
        return c;
    }
}
