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
    public void fibonacciWithCache() throws  Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(5l,null) , equalTo(8L));
        Long[] cache = new Long[6];
        Fibonacci.fibCacheLong(5l,cache);
        assertThat("The fibonacci number" , cache[2] , equalTo(2L));
        assertThat("The fibonacci number" , cache[3] , equalTo(3L));
        assertThat("The fibonacci number" , cache[4] , equalTo(5L));
        assertThat("The fibonacci number" , cache[5] , equalTo(8L));
    }
    @Test
    public void fibonacciWithCacheMediumSize() throws Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(20l,null) , equalTo(10946L));

    }

    @Test
    public void fibonacciWithCacheBigSizeUnderLimit() throws Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(91l,null) , equalTo(7540113804746346429L));

    }
    @Test(expected=Exception.class)
    public void fibonacciWithCacheBigSize() throws Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(100l,null) , equalTo(1298777728820984005L));

    }

    @Test
    public void fibonacciDoubleWithCache() {
        assertThat("The fibonacci number" , Fibonacci.fibCacheDouble(5D,null) , equalTo(8.00D));
        Double[] cache = new Double[6];
        Fibonacci.fibCacheDouble(5D,cache);
        assertThat("The fibonacci number" , cache[2] , equalTo(2.00));
        assertThat("The fibonacci number" , cache[3] , equalTo(3.00));
        assertThat("The fibonacci number" , cache[4] , equalTo(5.00));
        assertThat("The fibonacci number" , cache[5] , equalTo(8.00));
    }

    @Test
    public void fibonacciDoubleWithCacheBigSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCacheDouble(100.00,null) , equalTo(5.731478440138172E20));

    }
}
