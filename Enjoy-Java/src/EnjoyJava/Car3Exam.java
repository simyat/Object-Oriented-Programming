package EnjoyJava;

public class Car3Exam {
    public static void main(String[] args) {
//        EnjoyJava.Car3 c = new EnjoyJava.Car3(); 'EnjoyJava.Car3' is abstract; cannot be instantiated
        Car3 t = new Truck("volvo");
        t.run();

        SportsCar s1 = new SportsCar("sportsCar!!");
        s1.run();

        Car3 c = new SportsCar("페라리");
        c.run();
    }
}
