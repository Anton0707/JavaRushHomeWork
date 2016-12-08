package com.javarush.test.level18.lesson08.task03;

import java.io.*;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream. Используйте наследование.
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream extends FileOutputStream {
    private FileOutputStream stream;
    public AmigoOutputStream(FileOutputStream stream) throws IOException
    {
        super(fileName);
        this.stream = stream;
    }
    public static String fileName = "C:/tmp/result.txt";

    public void close() throws IOException{
        stream.flush();
        String s = "JavaRush © 2012-2013 All rights reserved.";
        stream.write(s.getBytes());
        stream.close();
    }
    public void write(byte[] b) throws IOException
    {
        stream.write(b);
    }
    public static void main(String[] args) throws FileNotFoundException,IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}

