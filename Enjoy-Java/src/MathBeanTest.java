public class MathBeanTest {
    public static void main(String[] args) {
        MathBean math = new MathBean(); // heap 메모리에 올라간다.
        math.printClassName();
        math.printNumber(5000);
        System.out.println(math.getOne());
        System.out.println(math.plus(200, 300));
    }
}
