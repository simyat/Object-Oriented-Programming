package JavaWorkspace.chap_04;


import java.util.Scanner;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 직접 수정
        final int price = 4000;
        boolean light_car = false; // 직접 수정
        boolean withDisablePerson = true; // 직접 수정

        int fee = hour * price;

        if (fee > 30000) {
            fee = 30000;
        }

        if (light_car || withDisablePerson) {
            fee /= 2;
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
