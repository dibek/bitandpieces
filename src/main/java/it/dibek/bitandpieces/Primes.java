package it.dibek.bitandpieces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by giuseppe.dibella on 14/02/2017.
 */
public class Primes {




    public static boolean isPrime(int number) {
        for (int i = number-1; i > 1 ; i--) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> extractPrimes(int numToExtract) {
        int numberToTest = numToExtract*numToExtract;

        List<Integer> listPrimes = new ArrayList<>();
        while (numberToTest>1) {
            if (Primes.isPrime(numberToTest)) {
                listPrimes.add(numberToTest);

            }
            numberToTest--;
        }
        // add 1 to the list
        listPrimes.add(1);
        // sort in natural order
        Collections.sort(listPrimes);
        // extract numToExtract
        listPrimes = listPrimes.subList(0,numToExtract);
        return listPrimes;

    }

    public static void main(String[] args){
        int primesToExtract = 20;
        if (args.length > 0) {
             primesToExtract = Integer.valueOf(args[1]);
        }
      System.out.print("first " + primesToExtract + " -> " + Primes.extractPrimes(primesToExtract));
    }
}
