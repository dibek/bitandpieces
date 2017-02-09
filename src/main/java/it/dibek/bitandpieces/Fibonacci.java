package it.dibek.bitandpieces;

/**
 * Created by giuseppe.dibella on 06/02/2017.
 */
public class Fibonacci {

    public static Long fib(Long fNumber){
        if (fNumber <=1) {
            System.out.println(fNumber + "->");
            return 1L;
        }
        System.out.println(fNumber + "->");
        return fib(fNumber -1) + fib(fNumber -2);
    }

    public static Long fibCacheLong(int fNumber, Long[] cache) throws Exception{
        if (cache == null) {
            cache = new Long[fNumber+1];
        }

        if (cache[fNumber] != null) {
            System.out.println(fNumber + "-> in Cache with value " + cache[fNumber]);
            return cache[fNumber];
        }
        if (fNumber <=1) {
            cache[fNumber] = 1L;
            System.out.println(fNumber + "->");
            return 1L;
        }


        cache[fNumber] = fibCacheLong(fNumber -1,cache) + fibCacheLong(fNumber -2,cache);
        if (cache[fNumber] < 0) {
            throw new Exception("hit limit for Long for index " + fNumber);
        }
        return  cache[fNumber];
    }

    public static Double fibCacheDouble(int fNumber, Double[] cache){
        if (cache == null) {
            cache = new Double[fNumber+1];
        }

        if (cache[fNumber] != null) {
            System.out.println(fNumber + "-> in Cache with value " + cache[fNumber]);
            return cache[fNumber];
        }
        if (fNumber <=1) {
            cache[fNumber] = 1D;
            System.out.println(fNumber + "->");
            return 1D;
        }


        cache[fNumber] = fibCacheDouble(fNumber -1,cache) + fibCacheDouble(fNumber -2,cache);
        return  cache[fNumber];
    }


    public void main(String[] args) {
        Long fNumber = Long.valueOf(args[1]);
        Fibonacci.fib(fNumber);
    }
}
