package com.example.main;

import com.example.util.Calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int plus = cal.plus(10, 2);
        System.out.println(plus);

        com.example.util2.Calculator cal2 = new com.example.util2.Calculator();
        int divide = cal2.divide(10, 2);
        System.out.println(divide);
    }
}
