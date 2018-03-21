package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial multiply = new Factorial();
        assertThat(multiply.calc(5), is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial multiply = new Factorial();
        assertThat(multiply.calc(0), is(1));
    }

    @Test
    public void whenCalculateFactorialForOneThenOne() {
        Factorial multiply = new Factorial();
        assertThat(multiply.calc(1), is(1));
    }

}