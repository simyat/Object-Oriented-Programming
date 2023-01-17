package JavaWorkspace.chap_07;

import JavaWorkspace.chap_07.camera.Camera;
import JavaWorkspace.chap_07.camera.FactoryCam;
import JavaWorkspace.chap_07.camera.SpeedCam;

public class _12_Inheritance {
    public static void main(String[] args) {
        Camera camera = new Camera();
        FactoryCam factoryCam = new FactoryCam();
        SpeedCam speedCam = new SpeedCam();

        System.out.println(camera.name);
        System.out.println(factoryCam.name);
        System.out.println(speedCam.name);

        camera.takePicture();
        factoryCam.recordVedio();
        speedCam.takePicture();

        factoryCam.detectFire();
        speedCam.checkSpeed();
        speedCam.recognizeLicensePlate();
    }
}
