package JavaWorkspace.chap_06;

public class _Quiz_06 {
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-4567";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }

    private static String getHiddenData(String Data, int index) {
        String cut = Data.substring(index);
        if(index == 1){
            Data = Data.replace(cut, "**"); // 나"코딩" -> 나 **
        } else if (index == 8) {
            Data = Data.replace(cut, "******");
        } else if (index == 9) {
            Data = Data.replace(cut, "****");
        }
        return Data;
    }

//    여러 줄 주석 단축키 = ctrl + shfit + /
    /*private static String getHiddenData(String Data, int index) {
        String HiddenData = Data.substring(0, index);
        for (int i = 0; i < Data.length() - index; i++) {
            HiddenData += "*";
            // String concatenation '+=' in loop. String 문자열을 더하는 것은 새로운 String 객체를 생성하므로 메모리 낭비로 이어진다. 따라서 StringBuilder를 쓰는 것이 좋다.
        }

        return HiddenData;
    }*/
}
