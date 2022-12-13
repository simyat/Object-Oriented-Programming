package com.example.util;

public class Calculator {
    public int plus(int x, int y){
        return x + y;
    }

    public int minus(int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int plus = cal.plus(10, 15);
        int minus = cal.minus(3, 1);
        System.out.println(plus);
        System.out.println(minus);
    }
}
