package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class AssociationArraysTest {
    @Test
    public void whenAssociatedArray1() {
        AssociationArrays associate = new AssociationArrays();
        int[] a = new int[]{1, 2, 2, 4, 5, 7, 7};
        int[] b = new int[]{3, 3, 5, 6, 6, 8, 9};
        int[] result = associate.association(a, b);
        int[] expect = new int[]{1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7, 8, 9};
        assertThat(result, is(expect));
    }

    @Test
    public void whenAssociatedArray2() {
        AssociationArrays associate = new AssociationArrays();
        int[] a = new int[]{6, 7, 8, 9, 10, 11, 12};
        int[] b = new int[]{1, 2, 3, 4, 5, 8, 9};
        int[] result = associate.association(a, b);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12};
        assertThat(result, is(expect));
    }

    @Test
    public void whenAssociatedArray3() {
        AssociationArrays associate = new AssociationArrays();
        int[] a = new int[]{1, 3, 6};
        int[] b = new int[]{3, 4, 5, 8, 9};
        int[] result = associate.association(a, b);
        int[] expect = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 9, 10, 11, 12};
        assertThat(result, is(expect));
    }

    @Test
    public void whenAssociatedArray4() {
        AssociationArrays associate = new AssociationArrays();
        int[] a = new int[]{-6, -4, -2, 0, 1, 3, 6};
        int[] b = new int[]{3, 4, 5, 8, 9};
        int[] result = associate.association(a, b);
        int[] expect = new int[]{-6, -4, -2 ,0, 1, 3, 3, 4, 5, 6, 8, 9};
        assertThat(result, is(expect));
    }
}