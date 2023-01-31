package JavaWorkspace.chap_07.camera;

public class _16_Reference {
    public static void main(String[] args) {
//        참조
//         기본 자료형
//        int, float, double, long ...
        int[] i = new int[3];
        i[0] = 1;
        System.out.println(i[0]); // 0

        double d[] = new double[3];
        System.out.println(d[0]); // 0.0

//        참조 자료형 String, Camera, FactoryCam (객체)
        String[] s = new String[3];
        System.out.println(s[0]);

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null);

        System.out.println("--------------------");
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("-------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2);
        System.out.println("-------------------");
        System.out.println(c1.name);
        System.out.println(c2.name);
    }

    private static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
