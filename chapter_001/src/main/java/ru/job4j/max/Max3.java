package ru.job4j.max;
/**
 * Max.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class Max3 {

    public int max3(int first, int second) {
        if(first > second) return first;
                else return second;
    }

    public Max3(){
    }

    public int max3(int first, int second, int third){
        return this.max3(this.max3(first, second), third);
            //return this.max3(temp, third);
    }
}
