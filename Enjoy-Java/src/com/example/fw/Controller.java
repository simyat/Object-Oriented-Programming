package com.example.fw;// com.example.fw.Controller  종류가 여러 개
// 초기화 - 같은 코드
// 실행 - 다른 코드 ?
// 마무리 - 같은 코드

public abstract class Controller {
//     protected는 같은 package이거나 상속 받았을 경우 접근 가능하다.
//     메소드에 final이 붙으면 오버라이딩 할 수 없다.
    protected final void init(){
        System.out.println("초기화 하는 코드");
    }

    protected final void close(){
        System.out.println("마무리하는 코드");
    }

    protected abstract void run(); // 매번 다른 코드

    // 내가 가지고 있는 메소드 호출한다.
    // 특정 순서를 가지고 있는 메소드. 이런 메소드를 템플릿 메소드라고 한다.
    public void execute(){
        this.init();// 초기화  /  this 생략 가능
        this.run();// 실행
        this.close();// 마무리
    }
}
