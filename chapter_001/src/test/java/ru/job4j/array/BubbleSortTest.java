package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BubbleSortTest {
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort sorter = new BubbleSort();
        int[] input = new int[] {1, 5, 1, 2, 3, 9, 7, 8, 9};
        int[] result = sorter.sort(input);
        int[] expect = new int[] {1, 1, 2, 3, 5, 7, 8, 9, 9};
        assertThat(result, is(expect));
    }
}