public class Person {
    String name; // 인스턴스 필드
    String address;
    boolean isVip;
    static int count; // 클래스 필드
    static {
        count = 100;
    }

    public void printName() { // 인스턴스 메소드
        System.out.println("내 이름은 " + name);
    }

    public static void printCount() { // 클래스 메소드
        System.out.println("count : " + count);
    }

}
