package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException
    {
        if (string==null || string=="") {
            throw new TooShortStringException();
        }
        char[] chars = string.toCharArray();
        int counter = 0;
        int indexfirstTab = -0;
        int indexlastTab = -1;
        for (int i =0;i<string.length();i++) {
            if (chars[i]=='\t') {
                if (counter ==0 ) {indexfirstTab =i+1;}
                indexlastTab=i;
                counter++;
            }
            if (counter==2) {
                break;
            }
        }
        if (counter<=1) {
            throw new TooShortStringException();
        }
        return string.substring(indexfirstTab,indexlastTab);
    }
    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("tab0\ttab\ttab1\t"));       //tab
        System.out.println(getPartOfString("\t\t"));                    //
        System.out.println(getPartOfString("123\t123"));                //Exception
        System.out.println(getPartOfString(null));                      //Exception
    }
}
