package JavaWorkspace.chap_10;

import java.util.ArrayList;
import java.util.Arrays;

public class Quiz_10 {
    public static void main(String[] args) {
        Customer customer[] = new Customer[5];
        customer[0] = new Customer("챈들러", 50);
        customer[1] = new Customer("레이첼", 42);
        customer[2] = new Customer("모니카", 21);
        customer[3] = new Customer("벤자민", 18);
        customer[4] = new Customer("제임스", 5);

        System.out.println("미술관 입장료");

        Arrays.stream(customer).map(i -> {
            if (i.age >= 20) {
                return i.name + " 5000원";
            } else {
                return i.name + " 무료";
            }
        }).forEach(System.out::println);

        ArrayList<Customer> list = new ArrayList<>();
        list.add(new Customer("챈들러", 50));
        list.add(new Customer("제임스", 5));


        System.out.println("-----------");
        list.stream()
                .map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료")
                .forEach(System.out::println);
    }
}
// 챈들러 50
// 레이첼 42
// 모니카 21
// 벤자민 18
// 제임스 5

class Customer {
// 손님 이름 및 나이 정보를 위한 클래스
    // 입장료 1인당 5000원
//    20세 이상 손님에게만 입장료 부과
    public String name;
    public int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
