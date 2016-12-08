package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        FileOutputStream OutputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream OutputStream2 = new FileOutputStream(reader.readLine());
        byte buffer1[] = new byte[fileInputStream.available()/2 + fileInputStream.available()%2];
        byte buffer2[] = new byte[fileInputStream.available()/2];
        reader.close();
        while (fileInputStream.available() > 0){
                OutputStream1.write(buffer1,0,fileInputStream.read(buffer1));
                OutputStream2.write(buffer2,0,fileInputStream.read(buffer2));
        }
        fileInputStream.close();
        OutputStream1.close();
        OutputStream2.close();
    }
}
