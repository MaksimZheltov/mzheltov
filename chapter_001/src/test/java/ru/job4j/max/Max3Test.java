package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Max3Test {
    @Test
    public void maxFromThree(){
        Max3 maxim = new Max3();
        assertThat(maxim.max3(5, 2, 3), is(5));
    }

}
