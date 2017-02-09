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
    public void fibonaacciIntWithoutCacheMediumSize(){

        assertThat("The fibonacci number" , Fibonacci.fib(20L) , equalTo(10946L));

    }

    @Test
    public void fibonacciIntWithCache() throws  Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(5,null) , equalTo(8L));
        Long[] cache = new Long[6];
        Fibonacci.fibCacheLong(5,cache);
        assertThat("The fibonacci number" , cache[2] , equalTo(2L));
        assertThat("The fibonacci number" , cache[3] , equalTo(3L));
        assertThat("The fibonacci number" , cache[4] , equalTo(5L));
        assertThat("The fibonacci number" , cache[5] , equalTo(8L));
    }
    @Test
    public void fibonacciLongWithCacheMediumSize() throws Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(20,null) , equalTo(10946L));

    }

    @Test
    public void fibonacciDoubleWithCacheMediumSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCacheDouble(20,null) , equalTo(10946D));

    }

    @Test
    public void fibonacciWithCacheBigSizeUnderLimit() throws Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(91,null) , equalTo(7540113804746346429L));

    }
    @Test(expected=Exception.class)
    public void fibonacciWithCacheBigSize() throws Exception {
        assertThat("The fibonacci number" , Fibonacci.fibCacheLong(100,null) , equalTo(1298777728820984005L));

    }

    @Test
    public void fibonacciDoubleWithCache() {
        assertThat("The fibonacci number" , Fibonacci.fibCacheDouble(5,null) , equalTo(8.00D));
        Double[] cache = new Double[6];
        Fibonacci.fibCacheDouble(5,cache);
        assertThat("The fibonacci number" , cache[2] , equalTo(2.00));
        assertThat("The fibonacci number" , cache[3] , equalTo(3.00));
        assertThat("The fibonacci number" , cache[4] , equalTo(5.00));
        assertThat("The fibonacci number" , cache[5] , equalTo(8.00));
    }

    @Test
    public void fibonacciDoubleWithCacheBigSize() {
        assertThat("The fibonacci number" , Fibonacci.fibCacheDouble(100,null) , equalTo(5.731478440138172E20));

    }

    @Test
    public void compareDoubleAndLong() throws Exception {
        //given
        int indexFib = 80;
        Double[] cacheDouble = new Double[indexFib];
        Long[] cacheLong = new Long[indexFib];
        Fibonacci.fibCacheDouble(indexFib-1,cacheDouble);
        Fibonacci.fibCacheLong(indexFib-1,cacheLong);

        for (int i = 0  ; i < cacheDouble.length; i++){
            assertThat("The fibonacci number" , cacheDouble[i] , equalTo(cacheLong[i].doubleValue()));
        }


    }
}
