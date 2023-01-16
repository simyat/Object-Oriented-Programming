package JavaWorkspace.chap_07;

public class _07_This {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.modelName = "까망이"; // 까망이(최신형)
        blackBox.appendModelName("까망이 (최신형)");
        System.out.println(blackBox.modelName);
    }
}
