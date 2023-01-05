public class SportsCar extends Car3{
    // 부모 기본 생성자가 없기 때문에 super() 호출
    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("사륜구동으로 동작한다.");
    }
}
