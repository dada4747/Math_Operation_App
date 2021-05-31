package com.bridgelabz;
@FunctionalInterface
interface IMathFunction {
    int calculation(int a, int b);
    static void printResult(int i, int i1, String function, IMathFunction funObj){
        System.out.println("Result of :" + function + " is " + funObj.calculation(i, i1));
    }
}
