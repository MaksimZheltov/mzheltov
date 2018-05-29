package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.collection.IsArrayContainingInAnyOrder.arrayContainingInAnyOrder;
import static org.junit.Assert.*;

public class ArrayDuplicateTest {

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate(){
        String[] input = {"Привет", "Мир", "Привет", "Супер", "Мир"};
        String[] expectArray = {"Привет", "Мир", "Супер"};
        ArrayDuplicate duplicate = new ArrayDuplicate();
        String[] resultArray = duplicate.remove(input);
        assertThat(resultArray, arrayContainingInAnyOrder(expectArray));
    }

}