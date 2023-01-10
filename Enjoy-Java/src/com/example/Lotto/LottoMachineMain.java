package com.example.Lotto;

public class LottoMachineMain {
    public static void main(String[] args) {
//        변수가 45개 필요하다.
        Ball[] balls = new Ball[LottoMachine.MAX_BALL_COUNT]; // Ball 인스턴스 45개를 참조할 수 있는 배열이 만들어진다.
        for (int i = 0; i < LottoMachine.MAX_BALL_COUNT; i++) {
            balls[i] = new Ball(i + 1);
        }

//        lottoMachine 인스턴스 생성
        LottoMachine lottoMachine = new LottoMachineImpl();
        lottoMachine.setBalls(balls);
        lottoMachine.mix();
        Ball result[] = lottoMachine.getBalls();
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].getNumber());
        }
    }
}
