package JavaWorkspace.chap_07.camera;

public class SpeedCam extends Camera{ // 하위 클래스
    public SpeedCam() {
        this.name = "과속단속 카메라";
    }
    public void checkSpeed() {
        System.out.println(this.name + " : 속도를 측정합니다.");
    }
    public void recognizeLicensePlate() {
        System.out.println(this.name + " : 차량 번호를 인식합니다.");
    }

    @Override
    public void showMainFeature() {
        System.out.println(this.name + "의 주요 기능 : 속도 측정, 번호 인식");
    }
}
