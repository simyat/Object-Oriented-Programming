package JavaWorkspace.chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨
        b1.insertMemoryCard(16, true);

//        일반 영상 : 0
//        충돌 감지 영상 : 1
        int videoFileCount = b1.getVideoFileCount(0);
        System.out.println("일반 영상 파일 수 : "+ videoFileCount + "개");
        int videoFileCount1 = b1.getVideoFileCount(1);
        System.out.println("충돌 영상 파일 수 : " + videoFileCount1 + "개");
    }
}
