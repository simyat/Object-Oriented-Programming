package EnjoyJava;

public class CarExam02 {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1); // println(Object x) - Object로 참조할 수 있는 것은 무엇이든 받을 수 있다.

        System.out.println("-----------");

        Car c2 = new Car("KIA");
        c2.printName();
    }
// 부모타입 변수로 자식 인스턴스를 참조할 수 있다.
// 조상타입 변수로 후손 인스턴스를 참조할 수 있다.
//    EnjoyJava.Car c1 = new EnjoyJava.Bus();
//    EnjoyJava.Car c2 = new 이층버스(); // 이층버스는 EnjoyJava.Car 자손
//    Object o1 = new EnjoyJava.Car();
//    Object o2 = new EnjoyJava.Bus();
//    Object o3 = new 이층버스();

//    System.out.println(o1.toString()); == System.out.println(o1);
}
