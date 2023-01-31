package JavaWorkspace.chap_07;

import JavaWorkspace.chap_07.camera.Camera;
import JavaWorkspace.chap_07.camera.FactoryCam;
import JavaWorkspace.chap_07.camera.SpeedCam;

public class _14_Polymorphism {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (Camera cam : cameras
             ) {
            cam.showMainFeature();
        }

        System.out.println("-----------------------");

        if(camera instanceof Camera){
            System.out.println("카메라입니다.");
        }

        if(factoryCam instanceof FactoryCam){
            ((FactoryCam) factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }

        System.out.println("-----------------------");

        Object[] obj = new Object[3];
        obj[0] = new Camera();
        obj[1] = new FactoryCam();
        obj[2] = new SpeedCam();

        ((Camera) obj[0]).showMainFeature();

    }
}
