package JavaWorkspace.chap_08.camera;

import JavaWorkspace.chap_08.detector.Detectable;
import JavaWorkspace.chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    Detectable detector;
    Reportable reporter;

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void SetDetector(Detectable detector) {
        this.detector = detector;
    }

    public void SetReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    public void detect() {
        System.out.println("사용하는 인터페이스 : " + this.detector.getClass());
        this.detector.detect();
    }

    public void report() {
        System.out.println("사용하는 인터페이스 : " + this.reporter.getClass());
        this.reporter.report();
    }


//    public void detect() {
//        System.out.println("사고를 감지합니다.");
//    }

//    public void report() {
//        System.out.println("사고 신고를 진행합니다.");
//    }
}


