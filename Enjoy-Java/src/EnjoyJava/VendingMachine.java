package EnjoyJava;

public class VendingMachine {
    // 필드 (클래스가 가지는 것들)
    // 생성자
    // 메소드
    public String pushProductButton(int menuId){
        System.out.println(menuId + "를 전달받았습니다.");
        return "콜라";
    }

    public static void printVersion(){
        System.out.println("v1.0");
    }
}

