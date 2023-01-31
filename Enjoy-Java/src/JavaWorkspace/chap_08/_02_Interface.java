package JavaWorkspace.chap_08;

import JavaWorkspace.chap_08.camera.FactoryCam;
import JavaWorkspace.chap_08.detector.AdvancedFireDetector;
import JavaWorkspace.chap_08.detector.Detectable;
import JavaWorkspace.chap_08.detector.FireDetector;
import JavaWorkspace.chap_08.reporter.NomarReporter;
import JavaWorkspace.chap_08.reporter.Reportable;
import JavaWorkspace.chap_08.reporter.VideoReporter;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 상속, 추상 클래스는 단일상속만 가능
        Reportable nomarReporter = new NomarReporter();
        nomarReporter.report();
        System.out.println("-------------------------");
        Reportable videoReporter = new VideoReporter();
        videoReporter.report();
        System.out.println("-------------------------");
        Detectable fireDetector = new FireDetector();
        fireDetector.detect();
        System.out.println("-------------------------");
        Detectable advancedFireDetector = new AdvancedFireDetector();
        advancedFireDetector.detect();

        System.out.println("-------------------------");

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);

        factoryCam.detect();
        factoryCam.report();
    }
}
