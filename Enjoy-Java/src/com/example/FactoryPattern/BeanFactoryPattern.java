package com.example.FactoryPattern;

public class BeanFactoryPattern {
    public static void main(String[] args) {
        BeanFactory bf1 = BeanFactory.getInstance();
        BeanFactory bf2 = BeanFactory.getInstance();
        if (bf1 == bf2) {
            System.out.println("bf1 == bf2");
        }

        Bus b1 = bf1.getBus();
        Bus b2 = bf1.getBus();

        b1.a();
        b2.a();

        // Bus b3 = new Bus();

    }
}