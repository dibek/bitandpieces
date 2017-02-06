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

    public static Long fibCache(Long fNumber,Long[] cache){
        if (cache == null) {
            cache = new Long[fNumber.intValue()+1];
        }

        if (cache[fNumber.intValue()] != null) {
            System.out.println(fNumber + "-> in Cache");
            return cache[fNumber.intValue()];
        }
        if (fNumber <=1) {
            cache[fNumber.intValue()] = 1L;
            System.out.println(fNumber + "->");
            return 1L;
        }


        cache[fNumber.intValue()] = fibCache(fNumber -1,cache) + fibCache(fNumber -2,cache);
        return  cache[fNumber.intValue()];
    }

    public void main(String[] args) {
        Long fNumber = Long.valueOf(args[1]);
        Fibonacci.fib(fNumber);
    }
}
