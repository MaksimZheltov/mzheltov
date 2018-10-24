package ru.job4j.array;

/**
 * BubbleSort.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
    public int[] sort(int[] array) {
        for(int indexEx = array.length - 1; indexEx > 0; indexEx--) {
            for(int indexIn = 0; indexIn < indexEx; indexIn++) {
                if(array[indexIn] > array[indexIn + 1]) {
                    int temp = array[indexIn];
                    array[indexIn] = array[indexIn + 1];
                    array[indexIn + 1] = temp;
                }
            }
        }
        return array;
    }
}
