package ru.job4j.array;

/**
 * Check.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

//import java.util.Arrays;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
            for(int index = 0; index < data.length-1; index++) {
                if(data[0] != data[index + 1]) {
                    result = false;
                    break;
                }
            }
        return result;
    }
}
