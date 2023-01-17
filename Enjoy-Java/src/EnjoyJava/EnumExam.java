package EnjoyJava;

enum Coffee{
    AMERICANO,
    CAFE_LATTE;
//  왜 enum은 컴파일 시 안전하다고 하는가?
    public static void Coffee_choice(Coffee type) {
        System.out.println("선택하신 커피는 " + type + "입니다.");
    }
}

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

}

public class EnumExam {
    public static void main(String[] args) {

        final String AMERICANO = "아메리카노";
        final String CAFE_LATTE = "카페라떼";

        System.out.println(AMERICANO);
        System.out.println(CAFE_LATTE);
//        EnumExam exam1 = new EnumExam();
        Coffee.Coffee_choice(Coffee.CAFE_LATTE);

        Day today = Day.MONDAY;

        switch (today){
            case MONDAY:
                System.out.println("월요일입니다.");
                break;
            case TUESDAY:
                System.out.println("화요일입니다.");
                break;
        }
    }
}
