package com.example.FactoryPattern;

public class Bus extends Car{
    @Override
    public void a() {
        System.out.println("overriding a");
    }

    public void b(int p){
        System.out.println(p);
    }
    public void c(){
        System.out.println("c");
    }
}
