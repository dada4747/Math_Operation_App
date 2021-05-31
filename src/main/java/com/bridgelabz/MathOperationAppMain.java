package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MathOperationAppMain {
    public static void main(String[] args) {
        //Math operaions add mult and sub
        IMathFunction add = (a, b) -> a + b;
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction substract = (a, b) -> a / b;
        IMathFunction.printResult(6, 3, "Addition ", add);
        IMathFunction.printResult(6, 3, "Multiplication ", multiply);
        IMathFunction.printResult(6, 3, "Substraction ", substract);

        ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(23,28,98,47,23,12,24));
        //method 1...
        Iterator<Integer> it=numbers.iterator();
        while(it.hasNext()) {
            Integer i=it.next();
            System.out.println("Iterator value :: "+i);
        }
        //method 2...
        MyConsumer myconsumer=new MyConsumer();
        numbers.forEach(myconsumer);
        //method 3..
        numbers.forEach(new Consumer<Integer>() {
            public void accept(Integer t) {
                System.out.println("Method 3 for anonymous class : "+t);
            }
        });
        //method 4..(explicit lambda)
        Consumer<Integer> myListAction=n->{
            System.out.println("Method 4 : "+n);
        };
        numbers.forEach(myListAction);

        //method 5..(implicit lambda)
        numbers.forEach(n->{
            System.out.println("Method 5: for each numbers "+n);
        });
        //conver interget to double of given list
        Function<Integer, Double> doubleFunction = Integer -> (Double.valueOf(Integer));
        numbers.forEach(n -> {
            System.out.println("Method 6: Applying double function " + doubleFunction.apply(n));
        });
        //predicate function
        Predicate<Integer> isEvenFunction= n->n%2==0;
        numbers.forEach(n->{
            System.out.println("Method 7: Applyong is Evenfunction on  "+n+"  and result is : "+isEvenFunction.test(n));
        });
    }
}