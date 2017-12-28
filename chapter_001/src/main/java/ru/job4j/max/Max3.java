package ru.job4j.max;
/**
 * Max.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Max3 {
    private int max2;

    public int max(int first, int second, int third) {
        //max2 = Math.max(first, second);
        //return Math.max(max2, third);
        return Math.max(Math.max(first, second), third);
    }
}
