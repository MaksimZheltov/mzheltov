package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
    //public void maxFromTwo(){
        Counter sum = new Counter();
        assertThat(sum.add(1, 10), is(30));
    }

}


