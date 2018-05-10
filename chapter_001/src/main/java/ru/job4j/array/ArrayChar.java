package ru.job4j.array;

/**
 * ArrayChar.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayChar {
    private char[] data;

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    public boolean startsWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for(int index = 0; index < value.length; index++){
            if(value[index] != data[index]){
                result = false;
            }
        }
        return result;
    }
}
