package JavaWorkspace.chap_08;

import JavaWorkspace.chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; // public
//        b1.resolution = "FHD"; // default 같은 패키지 내에서만 접근 가능 resolution is not public
//        b1.price = 200000; // private 해당 클래스 내에서만 접근 가능 price has private access
//        b1.color = "화이트"; // protected 같은 패키지가 아닌 다른 패키지면 자식 클래스인 경우에만 접근 가능 color has protected access
    }
}
