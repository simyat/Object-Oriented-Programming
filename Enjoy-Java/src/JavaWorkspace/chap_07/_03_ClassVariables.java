package JavaWorkspace.chap_07;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox blackBox = new BlackBox();
        blackBox.modelName = "까망이";
        System.out.println(blackBox.modelName);

        BlackBox blackBox2 = new BlackBox();
        blackBox2.modelName = "하양이";
        System.out.println(blackBox2.modelName);

//        특정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(blackBox.modelName + " 자동 신고 기능 : " + blackBox.canAutoReport);
        System.out.println(blackBox2.modelName + " 자동 신고 기능 : " + blackBox2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

        BlackBox.canAutoReport = true;

        System.out.println(" - 개발 후 - ");
        System.out.println(blackBox.modelName + " 자동 신고 기능 : " + blackBox.canAutoReport);
        System.out.println(blackBox2.modelName + " 자동 신고 기능 : " + blackBox2.canAutoReport);
        System.out.println("모든 블랙박스 제품 자동 신고 기능 : " + BlackBox.canAutoReport);

    }
}
