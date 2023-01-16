package JavaWorkspace.chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지
        Random random = new Random();
        System.out.println("랜덤 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만 정수 반환
//        System.out.println("랜덤 정수 (범위) : " + random.nextDouble());
        double min = 5.0;
        double max = 10.0;

        System.out.println("랜덤 실수 (범위) : " + (min + (max - min) * random.nextDouble())); // 5.0 - 10.0 미만 실수 반환
        System.out.println("랜덤 boolean : " + random.nextBoolean());
        System.out.println("로또 번호를 뽑아줘! " + (random.nextInt(45) + 1)); // 1 이상 46 미만 정수 반환
    }
}
