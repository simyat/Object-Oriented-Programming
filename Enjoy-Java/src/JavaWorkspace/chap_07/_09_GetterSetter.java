package JavaWorkspace.chap_07;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.modelName = "까망이";
//        blackBox.resolution = "FHD";
        blackBox.price = 200000;
        blackBox.color = "블랙";

        // 할인 행사
        blackBox.price = -5000;
//        System.out.println("가격 : " + blackBox.price + "원");

        // 고객 문의
//        System.out.println("해상도 : " + blackBox.resolution);

        BlackBox blackBox2 = new BlackBox();
        blackBox2.setModelName("하양이");
        blackBox2.setPrice(-5000);
        blackBox2.setColor("화이트");
//        blackBox2.setResolution("UHD");

        System.out.println("가격 : " + blackBox2.getPrice() + "원");
        System.out.println("해상도 : " + blackBox2.getResolution());

        blackBox2.price = -5000;
        System.out.println("가격 : " + blackBox2.getPrice() + "원");
    }
}
