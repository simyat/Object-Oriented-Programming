package JavaWorkspace.chap_03;

import java.sql.Struct;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 True, 다르면 False
        System.out.println(s2.equalsIgnoreCase("python")); // 대소문자 구분없이 문자열 내용 같은지 체크

//        문자열 비교 심화
        s1 = "1234";
        s2 = "1234";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); // 같은 레퍼런스 값을 참고하므로 True

        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true 내용이 같은지 비교한다.
        System.out.println(s1 == s2); // false 주소가 같은지 비교한다.


    }
}
