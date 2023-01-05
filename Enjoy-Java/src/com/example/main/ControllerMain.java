package com.example.main;

import com.example.fw.Controller;
import com.example.myproject.FirstController;
import com.example.myproject.SecondController;

public class ControllerMain {
    public static void main(String[] args) {
        Controller c1 = new FirstController();
        c1.execute();

        Controller c2 = new SecondController();
        c2.execute();
    }
}
