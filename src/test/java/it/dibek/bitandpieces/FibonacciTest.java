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

        assertThat("The fibonacci number" , Fibonacci.fib(5L) , equalTo(8L));

    }

    @Test
    public void fibonaacciWithoutCacheMediumSize(){

        assertThat("The fibonacci number" , Fibonacci.fib(20L) , equalTo(10946L));

    }

    @Test
    public void fibonacciWithCache() {
        assertThat("The fibonacci number" , Fibonacci.fibCache(5l,null) , equalTo(8L));
        Long[] cache = new Long[6];
        Fibonacci.fibCache(5l,cache);
        assertThat("The fibonacci number" , cache[2] , equalTo(2L));
        assertThat("The fibonacci number" , cache[3] , equalTo(3L));
        assertThat("The fibonacci number" , cache[4] , equalTo(5L));
        assertThat("The fibonacci number" , cache[5] , equalTo(8L));
    }
    @Test
    public void fibonacciWithCacheMediumSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCache(20l,null) , equalTo(10946L));

    }
    @Test
    public void fibonacciWithCacheBigSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCache(100l,null) , equalTo(1298777728820984005L));

    }

}
