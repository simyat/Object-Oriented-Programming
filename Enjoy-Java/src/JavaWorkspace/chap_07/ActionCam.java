package JavaWorkspace.chap_07;

import JavaWorkspace.chap_07.camera.Camera;

public final class ActionCam extends Camera {
    public final String lens; //"광각렌즈";

    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";
    }

    public final void makeVideo() {
//        this.lens = "표준렌즈"; Final
        System.out.println(this.name + " : 멋진 비디오를 제작합니다." + this.lens + "로 촬영하였습니다.");
    }
}
