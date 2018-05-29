package ru.job4j.array;

/**
 * ArrayDuplicate.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int duplicateLength = array.length;
        for(int indexExternal = 0; indexExternal < duplicateLength; indexExternal++) {
            for(int indexInternal = indexExternal + 1; indexInternal < duplicateLength; indexInternal++) {
                if (array[indexExternal].equals(array[indexInternal])) {
                    array[indexInternal] = array[duplicateLength - 1];
                    duplicateLength--;
                    indexInternal--;
                }
            }
        }
    return Arrays.copyOf(array, duplicateLength);
    }
}
