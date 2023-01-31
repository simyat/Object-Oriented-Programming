package JavaWorkspace.chap_08.camera;

import JavaWorkspace.chap_08.detector.Detectable;
import JavaWorkspace.chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    private Detectable detector;
    private Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

//    public FactoryCam(Detectable detector) {
//        this.detector = detector;
//    }
//
//    public FactoryCam(Reportable reporter) {
//        this.reporter = reporter;
//    }

    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}
