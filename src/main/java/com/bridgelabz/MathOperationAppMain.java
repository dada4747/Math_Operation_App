package com.bridgelabz;
public class MathOperationAppMain implements IMathFunction {
    public static void main(String[] args) {
        IMathFunction add = (a, b) -> a + b;
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction substract = (a, b) -> a / b;
        IMathFunction.printResult(6, 3, "Addition ", add);
        IMathFunction.printResult(6, 3, "Multiplication ", multiply);
        IMathFunction.printResult(6, 3, "Substraction ", substract);

    }
    @Override
    public int calculation(int a, int b) {
        return 0;
    }
}
