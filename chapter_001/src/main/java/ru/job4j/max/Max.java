/**
 * Max.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

package ru.job4j.max;

public class Max {
    private int result;
    public int max(int first, int second) {
        this.result = Math.max(first, second);
        return this.result;
    }
}
