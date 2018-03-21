package ru.job4j.loop;

/**
 * Counter.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    public int calc(int n) {
        int multiply = 1;
        if (n < 1) return 1;
            else
                for (int index = 1; index <= n; index++) {
                    multiply = multiply * index;
                }
                return multiply;
        }
}
