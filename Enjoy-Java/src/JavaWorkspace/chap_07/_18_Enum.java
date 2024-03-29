package JavaWorkspace.chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // Enum 상수의 묶음
//        옷 사이즈 : S, M, L, XL
//        OS 종류 : WIN 10, MACOS, Linux ..

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.UHD;
        System.out.println(resolution);

        System.out.println("동영상 녹화 품질 : ");
        switch (resolution) {
            case HD:
                System.out.println("일반화질");
                break;
            case FHD:
                System.out.println("고화질");
                break;
            case UHD:
                System.out.println("초고화질");
                break;

        }
        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        System.out.println("-------------------------");

        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.ordinal());
        }

        System.out.println("-------------------------");

        for (Resolution myRes: Resolution.values()) {
            System.out.println(myRes.name() + " : "  + myRes.getWidth());
        }
    }
}

enum Resolution{
    HD(1280), FHD(1920), UHD(3840);

    private final int width;
    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
