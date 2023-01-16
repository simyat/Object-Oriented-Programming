package JavaWorkspace.chap_07;

public class BlackBox {
    String modelName;
    String resolution;
    int price;
    String color;
    static boolean canAutoReport = false;
    int serialNumber;

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 / 값이 증가됨

    public BlackBox() {
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급 받았습니다. " + this.serialNumber);
    }

    public BlackBox(String modelName, String resolution, int price, String color) {
//        this(); // 기본 생성자 호출
//
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity, boolean insert) {
        if (insert) {
            System.out.println(capacity + "GB 메모리 카드가 삽입 되었습니다.");
        } else {
            System.out.println("메모리 카드가 삽입되지 않았습니다.");
        }
    }

    int getVideoFileCount(int type) {
        if (type == 0) {
            return 9;
        } else if (type == 1) {
            return 1;
        }
        return 10;
    }

    void record(boolean showDateTime, boolean showspeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showspeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000)로 연결 합니다.");
//        modelName = "test"; Non-static field 'modelName' cannot be referenced from a static context
//        canAutoReport = false; 클래스 변수는 클래스 메소드에서만 사용 가능하다.
    }

    public void appendModelName(String modelName) {
        this.modelName = modelName;
    }
}