package JavaWorkspace.chap_08;

import JavaWorkspace.chap_08.camera.SpeedCam;
import JavaWorkspace.chap_08.detector.AccidentDetector;
import JavaWorkspace.chap_08.reporter.VideoReporter;

public class Quiz_08 {
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.SetDetector(new AccidentDetector());
        speedCam.SetReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}
