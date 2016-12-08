package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;
import com.javarush.test.level16.lesson13.bonus01.common.BmpReader;
import com.javarush.test.level16.lesson13.bonus01.common.JpgReader;
import com.javarush.test.level16.lesson13.bonus01.common.PngReader;

/**
 * Created by admin on 8/22/16.
 */
public class ImageReaderFactory {
    static public  ImageReader getReader(ImageTypes types){
        ImageReader reader = null;
        if (types == ImageTypes.BMP) {
            reader = new BmpReader();
        } else if (types == ImageTypes.PNG) {
            reader = new PngReader();
        }else if (types == ImageTypes.JPG) {
            reader = new JpgReader();
        }
        else
        {
            throw  new  IllegalArgumentException("Неизвестный тип картинки");
        }
        return reader;
    }
}


