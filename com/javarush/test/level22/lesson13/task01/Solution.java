package com.javarush.test.level22.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static void main(String[] args)
    {
        String a [] = getTokens("level22.lesson13.task01", ".");
        for (String x:a)
        {
            System.out.println(x);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String result[] = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            result[i] = token;
            i++;
        }
        return result;
    }
}
