package JavaWorkspace.chap_07;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 접근 제어자
//        private : 해당 클래스 내에서만 접근 가능
//        public : 모든  클래스에서 접근 가능
//        default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
//        protected : 같은 패키지 내에서 가능, 다른 패키지인 경우 하위 클래스에서만 접근 가능

        BlackBoxRefurbish blackboxrefur = new BlackBoxRefurbish();
        blackboxrefur.modelName = "까망이";
//        BlackBoxRefurbish.resolution = "FHD";
        blackboxrefur.setPrice(200000);
        blackboxrefur.color = "블랙";

        // 할인 행사
        blackboxrefur.setPrice(-5000);
//        System.out.println("가격 : " + BlackBoxRefurbish.price + "원");

        // 고객 문의
//        System.out.println("해상도 : " + BlackBoxRefurbish.resolution);

        BlackBoxRefurbish blackboxrefur2 = new BlackBoxRefurbish();
        blackboxrefur2.setModelName("하양이");
        blackboxrefur2.setPrice(-5000);
        blackboxrefur2.setColor("화이트");
//        blackboxrefur2.setResolution("UHD");

        System.out.println("가격 : " + blackboxrefur2.getPrice() + "원");
        System.out.println("해상도 : " + blackboxrefur2.getResolution());

//        blackboxrefur2.price = -5000; price has private access
        System.out.println("가격 : " + blackboxrefur2.getPrice() + "원");
    }
}
