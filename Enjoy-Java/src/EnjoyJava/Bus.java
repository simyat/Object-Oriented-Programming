package EnjoyJava;

public class Bus extends Car2 {
    public Bus(){
        super("EnjoyJava.Bus"); // 부모의 기본 생성자를 호출하는 코드 super();가 자동으로 삽입된다.
        System.out.println("EnjoyJava.Bus 기본 생성자");
//        super는 인스턴스 부모를 참조할 때 사용하는 키워드이다.
//        super() 생성자는 부모 생성자를 의미한다.
//        super() 생성자는 생성자 안에서만 사용 가능하다.
//        super() 생성자는 생성자 안에서 첫번째 줄에만 올 수 있다.
//        생성자는 무조건 super() 생성자를 호출해야 한다. 사용자가 super() 생성자를 호출하는 코드를 작성하지 않았다면 자동으로 부모 기본생성자를 호출한다.
//        부모 클래스가 기본 생성자를 가지고 있지 않다면, 사용자는 반드시 직접 super() 생성자를 호출하는 코드를 작성해야 한다.

    }
}
