package JavaWorkspace.chap_07.camera;

public class FactoryCam extends Camera{ // 하위 클래스
    public FactoryCam() {
//        this.name = "공장 카메라";
        super("공장 카메라"); // protected 생성자 호출
    }

    @Override
    public void recordVedio() {
        super.recordVedio();
        detectFire();
    }

    public void detectFire() {
        // 화재 감지
        System.out.println(this.name + " : 화재를 감지합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 화재 감지");
    }
}
