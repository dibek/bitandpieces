package it.dibek.bitandpieces;


import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by giuseppe.dibella on 15/02/2017.
 */
public class PrimesTest  {

    @Test
    public void testPrimees() {
        int numberToTest = 129;
        assertThat(numberToTest +" is a prime number", Primes.isPrime(numberToTest), equalTo(false));
        numberToTest = 2453;
        assertThat(numberToTest +" is a prime number", Primes.isPrime(numberToTest), equalTo(false));
    }

    @Test
    public void printPrimes() {
        int primesToExtract = 100;
        List<Integer> listPrimes = Primes.extractPrimes(primesToExtract);
        System.out.println("list primes is " + listPrimes);
        assertTrue(listPrimes.size() > 0 );
    }

}