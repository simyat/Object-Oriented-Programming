package EnjoyJava;

public class PersonTest {
    public static void main(String[] args) {
        // EnjoyJava.Person p1; // pi is null
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "홍길동";
        p1.address = "남양주시";
        p1.isVip = true;
        p2.name = "조조";
        p2.address = "서울";

        System.out.println(p1.name);
        System.out.println(p1.name.length());
        System.out.println(p1.address);
//        System.out.println(p1.address.length()); java.lang.NullPointerException
        System.out.println(p1.isVip);
        System.out.println("----------");
        System.out.println(p2.name);
        System.out.println(p2.name.length());
        System.out.println(p2.address);
        System.out.println(p2.isVip);
    }
}
