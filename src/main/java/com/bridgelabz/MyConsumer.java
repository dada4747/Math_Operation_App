package com.bridgelabz;

import java.util.function.Consumer;

class MyConsumer implements Consumer<Integer> {
    public void accept(Integer t){
        System.out.println("Math 2 Consumer value:" + t);
    }
}