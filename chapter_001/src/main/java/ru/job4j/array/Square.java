package ru.job4j.array;

/**
 * Square.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Square {
    public int[] calculate(int bound){
        int[] rst = new int[bound];
            for (int index = 1; index <= bound; index++) {
                rst[index-1] = (int) Math.pow(index, 2);
            }
        return rst;
    }
}
