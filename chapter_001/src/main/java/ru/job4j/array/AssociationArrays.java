package ru.job4j.array;
/**
 * AssociationArrays.
 * @author Maksim Zheltov (mvzheltov@yandex.ru)
 * @version $Id$
 * @since 0.1
 */

public class AssociationArrays {
    public int[] association(int[] firstArray, int[] secondArray) {
        int[] thirdArray = new int[firstArray.length + secondArray.length];
        int indexFirst = 0;
        int indexSecond = 0;
        int indexThird = 0;
        while (indexThird < thirdArray.length) {
            if(indexFirst != firstArray.length) {
                if(indexSecond != secondArray.length) {
                    if (firstArray[indexFirst] <= secondArray[indexSecond]) {
                        thirdArray[indexThird++] = firstArray[indexFirst];
                        indexFirst++;
                    }
                    else {
                        thirdArray[indexThird++] = secondArray[indexSecond++];
                    }
                }
                else {
                    thirdArray[indexThird++] = firstArray[indexFirst++];
                }
            }
            else {
                thirdArray[indexThird++] = secondArray[indexSecond++];
            }
        }
        return thirdArray;
    }
}