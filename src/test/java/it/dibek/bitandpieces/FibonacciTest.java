package it.dibek.bitandpieces;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


/**
 * Created by giuseppe.dibella on 06/02/2017.
 */
public class FibonacciTest {

    @Test
    public void fibonaacciWithoutCache(){

        assertThat("The fibonacci number" , Fibonacci.fib(5) , equalTo(8));

    }

    @Test
    public void fibonaacciWithoutCacheMediumSize(){

        assertThat("The fibonacci number" , Fibonacci.fib(20) , equalTo(10946));

    }

    @Test
    public void fibonacciWithCache() {
        assertThat("The fibonacci number" , Fibonacci.fibCache(5l,null) , equalTo(8));
        Integer[] cache = new Integer[6];
        Fibonacci.fibCache(5l,cache);
        assertThat("The fibonacci number" , cache[2] , equalTo(2));
        assertThat("The fibonacci number" , cache[3] , equalTo(3));
        assertThat("The fibonacci number" , cache[4] , equalTo(5));
        assertThat("The fibonacci number" , cache[5] , equalTo(8));
    }
    @Test
    public void fibonacciWithCacheMediumSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCache(20l,null) , equalTo(10946));

    }
    @Test
    public void fibonacciWithCacheBigSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCache(100l,null) , equalTo(1869596475));

    }

}
