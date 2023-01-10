package com.example.FactoryPattern;

import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws Exception {
//        Bus b1 = new Bus();
//        b1.a();
        // a() 메소드를 가지고 있는 클래스가 있다.
//        이 클래스 이름이 무엇인지 모른다.
//        나중에 이 클래스 이름을 알려주겠다.
//        a() 메소드를 실행할 수 있도록 코드를 작성하라.

        String className = "com.example.FactoryPattern.Bus"; // "com.example.FactoryPattern.Bus"; "com.example.FactoryPattern.SuperCar";
        Class clazz = Class.forName(className);
        Object o = clazz.newInstance();
        Method m = clazz.getDeclaredMethod("b", int.class); // a() 메소드 정보를 가지고 있는 Method를 반환하라.
        m.invoke(o, 1); // Object o가 참조하는 객체의 m 메소드를 실행하라
//        Car c = new Bus();
//        Car b = (Car) o;// Bus b = (Bus) o;
//        b.a();

    }
}
