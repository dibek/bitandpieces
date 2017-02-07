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

    public static Long fibCacheLong(Long fNumber, Long[] cache) throws Exception{
        if (cache == null) {
            cache = new Long[fNumber.intValue()+1];
        }

        if (cache[fNumber.intValue()] != null) {
            System.out.println(fNumber + "-> in Cache with value " + cache[fNumber.intValue()]);
            return cache[fNumber.intValue()];
        }
        if (fNumber <=1) {
            cache[fNumber.intValue()] = 1L;
            System.out.println(fNumber + "->");
            return 1L;
        }


        cache[fNumber.intValue()] = fibCacheLong(fNumber -1,cache) + fibCacheLong(fNumber -2,cache);
        if (cache[fNumber.intValue()] < 0) {
            throw new Exception("hit limit for Long for index " + fNumber.intValue());
        }
        return  cache[fNumber.intValue()];
    }

    public static Double fibCacheDouble(Double fNumber, Double[] cache){
        if (cache == null) {
            cache = new Double[fNumber.intValue()+1];
        }

        if (cache[fNumber.intValue()] != null) {
            System.out.println(fNumber + "-> in Cache");
            return cache[fNumber.intValue()];
        }
        if (fNumber <=1) {
            cache[fNumber.intValue()] = 1D;
            System.out.println(fNumber + "->");
            return 1D;
        }


        cache[fNumber.intValue()] = fibCacheDouble(fNumber -1,cache) + fibCacheDouble(fNumber -2,cache);
        return  cache[fNumber.intValue()];
    }


    public void main(String[] args) {
        Long fNumber = Long.valueOf(args[1]);
        Fibonacci.fib(fNumber);
    }
}
