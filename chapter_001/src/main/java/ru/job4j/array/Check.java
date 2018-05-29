package ru.job4j.array;

/**
 * Check.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

import java.util.Arrays;

public class Check {
    public boolean mono(boolean[] data){
        boolean result = false;
            for(int index = 0; index < data.length; index++){
                if(data[0] == data[index + 1]){
                    result = true;
                }
            break;
            }
        return result;
    }
}
