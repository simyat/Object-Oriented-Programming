package JavaWorkspace.chap_07;

public class Quiz_07 {
    public static void main(String[] args) {
        HamBurger HamBurgers[] = new HamBurger[3];
        HamBurgers[0] = new HamBurger("햄버거");
        HamBurgers[1] = new CheeseBurger("치즈버거");
        HamBurgers[2] = new ShrimpBurger("새우버거");


        System.out.println("주문하신 메뉴를 만듭니다.");
        for (HamBurger HamBurger : HamBurgers) {
            System.out.println("-----------------------");
            HamBurger.cook();
        }

        System.out.println("메뉴 준비가 완료되었습니다.");
    }
}

class HamBurger {
    public String name;

    public HamBurger() {
        this("햄버거"); // HamBurger("햄버거); 호출
    }
    public HamBurger(String name) {
        this.name = name;
    }

    public void cook() {
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어가는 재료는?");
        System.out.println("> 양상추");
        System.out.println("+ 패티");
        System.out.println("+ 피클");
    }
}

class CheeseBurger extends HamBurger{
    public CheeseBurger(String name) {
        super(name);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends HamBurger{
    public ShrimpBurger(String name) {
        super(name);
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}