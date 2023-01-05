public class Car3Exam {
    public static void main(String[] args) {
//        Car3 c = new Car3(); 'Car3' is abstract; cannot be instantiated
        Car3 t = new Truck("volvo");
        t.run();

        SportsCar s1 = new SportsCar("sportsCar!!");
        s1.run();

        Car3 c = new SportsCar("페라리");
        c.run();
    }
}
