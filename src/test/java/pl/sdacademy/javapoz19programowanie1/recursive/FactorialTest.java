package pl.sdacademy.javapoz19programowanie1.recursive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void iteration() {
        Factorial factorial = new Factorial();
        Assert.assertEquals(1,factorial.iteration(0));
        Assert.assertEquals(1,factorial.iteration(1));
        Assert.assertEquals(2,factorial.iteration(2));
        Assert.assertEquals(6,factorial.iteration(3));
        Assert.assertEquals(24,factorial.iteration(4));
        Assert.assertEquals(120,factorial.iteration(5));
    }

    @Test
    public void recursive() {
        Fibonacci fibonacci = new Fibonacci();
        Assert.assertEquals(0, fibonacci.recursive(0));
        Assert.assertEquals(1, fibonacci.recursive(1));
        Assert.assertEquals(1, fibonacci.recursive(2));
        Assert.assertEquals(2, fibonacci.recursive(3));
        Assert.assertEquals(3, fibonacci.recursive(4));
        Assert.assertEquals(5, fibonacci.recursive(5));
        Assert.assertEquals(8, fibonacci.recursive(6));


    }
}