package com.bridgelabz;
public class MathOperationAppMain implements IMathFunction {
    public static void main(String[] args) {
        IMathFunction add = (a, b) -> a + b;
        IMathFunction multiply = (a, b) -> a * b;
        IMathFunction substract = (a, b) -> a / b;
        System.out.println("Addition:-" + add.calculation(6,3));
        System.out.println("Substraction:-" + multiply.calculation(2,5));
        System.out.println("Division:-" + substract.calculation(6,2));
    }
    @Override
    public int calculation(int a, int b) {
        return 0;
    }
}
