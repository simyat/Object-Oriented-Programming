package com.example.myproject;

import com.example.fw.Controller;

public class FirstController extends Controller {
    @Override
    protected void run() {
        System.out.println("별도로 동작하는 코드 111");
    }

//    @Override
//    protected void init() {
//        System.out.println("내 마음대로 init");
//    }
}
