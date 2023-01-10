package com.example.Lotto;


// 불변 객체 : 생성자로 받은 값을 리턴만 가능하고 변경할 수 없는 객체
public class Ball {
    private int number;
    public Ball(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
