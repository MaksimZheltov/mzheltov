package ru.job4j.max;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void maxFromTwo(){
        Max maxim = new Max();
        assertThat(maxim.max(1, 2), is(2));
    }

}
