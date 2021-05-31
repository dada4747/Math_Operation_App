package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

//import java.util.function.Consumer;
class MyConsumer implements Consumer<Integer> {
public void accept(Integer t){
        System.out.println("Math 2 Consumer value:" + t);
        }
        }

public class MathOperationAppMain {

    public static void main(String[] args) {
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




    }
}