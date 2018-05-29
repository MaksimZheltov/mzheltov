package ru.job4j.array;

/**
 * Check.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class MatrixCheck {
    public boolean mono(boolean[][] data){
        boolean result = false;
        int arrayIndex = data.length - 1;
        for(int i = 0; i < arrayIndex; i++){
                if(data[i][i] == data[i + 1][i + 1]){
                    if(data[arrayIndex][i] = data[arrayIndex - 1][i + 1]){
                    }
                result = true;
                }
        }
        return result;
    }
}
