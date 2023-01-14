package EnjoyJava;

public class CarExam {
    public static void main(String[] args) {
//        EnjoyJava.Car3 car = new EnjoyJava.Car3();
        Car3 car = new Car3("EnjoyJava.Bus") {
            @Override
            public void run() {
                System.out.println("이름없는 객체 a() 메소드 오버라이딩");
            }
        };

        car.run();



    }
}
