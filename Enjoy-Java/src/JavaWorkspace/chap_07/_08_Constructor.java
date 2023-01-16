package JavaWorkspace.chap_07;

public class _08_Constructor {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.modelName = "까망이";
        blackBox.resolution = "FHD";
        blackBox.price = 200000;
        blackBox.color = "화이트";
        System.out.println(blackBox.modelName);
        System.out.println(blackBox.serialNumber);
        System.out.println("--------------------");
        BlackBox blackBox2 = new BlackBox("노랑이", "UHD", 300000, "화이트");
        System.out.println(blackBox2.modelName);
        System.out.println(blackBox2.serialNumber);
    }
}
