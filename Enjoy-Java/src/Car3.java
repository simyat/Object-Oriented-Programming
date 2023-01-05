public abstract class Car3 {
    public Car3(String name){
        super(); // 자동으로 들어간다.
        System.out.println("Car3() 생성자 호출");
    }

    // 추상메소드. Car3 만든 사람은 run() 메소드가 필요하다고 생각하였다.
//    그런데 run()은 자동차마다 다르게 구현할 것 같다.
//    이런 경우 추상 메소드 사용!
    public abstract void run();
}
