package com.example.Lotto;// 1. 1~45 까지 써 있는 Ball을 로또 기계에 넣는다.
// 2. 로또 기계에 있는 Ball을 섞는다.
// 3. 섞인 Ball에서 6개를 꺼낸다.

// 인터페이스는

public interface LottoMachine {
    public static int MAX_BALL_COUNT = 45;
    public static int RETURN_BALL_COUNT = 6;

    public abstract void setBalls(Ball[] balls); // 1~45 까지 써 있는 Ball을 로또 기계에 넣는다.
    public abstract void mix(); // 2. 로또 기계에 있는 Ball을 섞는다.
    public abstract Ball[] getBalls(); // 3. 섞인 Ball에서 6개를 꺼낸다.

}
