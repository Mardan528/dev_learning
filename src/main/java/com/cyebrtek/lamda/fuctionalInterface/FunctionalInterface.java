package com.cyebrtek.lamda.fuctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {


        // Accepts a single parameter and returnes a single value
        Function<Integer,Double> half= a ->a/2.0;
        System.out.println(half.apply(10));


        // Does not accept any argument and returns an object
        Supplier<Double> randomValue=() -> Math.random();
        System.out.println(randomValue.get());


        //Accepts a single argument and returns true or false
        Predicate<Integer> leserThen=a -> (a<10);
        System.out.println(leserThen.test(5));





    }
}
