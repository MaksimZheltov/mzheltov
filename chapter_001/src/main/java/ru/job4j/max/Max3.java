package ru.job4j.max;
/**
 * Max.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Max3 {

    public int max3(int first, int second) {
        return Math.max(first, second);
    }

    public Max3(){
    }
    public int max3(int first, int second, int third){
        int temp = this.max3(first, second);
            return this.max3(temp, third);

    }
}
