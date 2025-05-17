package com.helwatkar.interview.preparations.java.fundamentals.genericsjava;

public class GenericCalculator<T extends Number> {
    private T number1;
    private T number2;

    public GenericCalculator(T number1, T number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double add() {
        return number1.doubleValue() + number2.doubleValue();
    }

    public double subtract() {
        return number1.doubleValue() - number2.doubleValue();
    }

    public double multiply() {
        return number1.doubleValue() * number2.doubleValue();
    }

    public double divide() {
        if (number2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return number1.doubleValue() / number2.doubleValue();
    }
}
