package it.dibek.bitandpieces;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    @Test
    public void firstTenPrimes() {
        int primesToExtract = 10;
        List<Integer> listPrimes = Primes.extractPrimes(primesToExtract);
        System.out.println("list primes is " + listPrimes);
        assertTrue(listPrimes.size() > 0 );
        int[] primes = {1,2,3,5,7,11,13,17,19,23};
        List<Integer> listPrimesCompare = Arrays.stream(primes).boxed().collect(Collectors.toList());
        assertTrue(listPrimes.equals(listPrimesCompare));
    }

}