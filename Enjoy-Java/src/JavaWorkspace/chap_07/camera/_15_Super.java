package JavaWorkspace.chap_07.camera;

public class _15_Super {
    public static void main(String[] args) {
        // 상위 클래스 자원을 하위 클래스가 사용하는 것 -> super
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        factoryCam.recordVedio();
        System.out.println("---------------");
        speedCam.takePicture();
    }
}
