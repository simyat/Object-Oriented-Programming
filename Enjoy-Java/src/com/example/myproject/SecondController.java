package com.example.myproject;

import com.example.fw.Controller;

public class SecondController extends Controller {
    @Override
    protected void run() {
        System.out.println("별도로 동작하는 코드 222");
    }
}
