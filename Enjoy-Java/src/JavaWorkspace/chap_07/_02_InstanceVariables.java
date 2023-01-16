package JavaWorkspace.chap_07;

public class _02_InstanceVariables {
    public static void main(String[] args) {

        BlackBox blackBox = new BlackBox();
        blackBox.modelName = "까망이";
        blackBox.resolution = "FHD";
        blackBox.price = 200000;
        blackBox.color = "블랙";

        System.out.println(blackBox.modelName);

        BlackBox blackBox2 = new BlackBox("하양이", "UHD", 300000, "화이트");
        System.out.println(blackBox2.modelName);
    }
}
