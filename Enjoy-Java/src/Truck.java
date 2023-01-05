public class Truck extends Car3{
    public Truck(String name) {
        super(name);
        System.out.println("Truck 기본 생성자");
    }

    // 부모가 가지고 있는 추상메소드는 반드시 구현을 해줘야 한다.
    @Override
    public void run() {
        System.out.println("후륜구동으로 동작한다.");
    }
}
