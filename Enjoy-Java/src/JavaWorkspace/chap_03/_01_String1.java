package JavaWorkspace.chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

//      문자열 길이
        System.out.println(s.length()); // 29

//      대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

//        포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.contains("C#"));

        System.out.println(s.indexOf("Java")); // Index 정보 7
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // 처음 일치하는 인덱스 정보 (12)
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 인덱스 정보 (23)
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 True, 아니면 False
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 True, 아니면 False

    }
}
