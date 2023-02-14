package JavaWorkspace.chap_13;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Quiz_13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);

        try (BufferedReader br = new BufferedReader(new FileReader("chap_13/saying.txt"))) {
            String quiz;
            String input;
            String answer;

            System.out.println("속담 퀴즈입니다. 빈 칸에 알맞은 말을 입력하시오 (주관식)");
            System.out.println("---------------------------------------------------");

            while (true) {
                quiz = br.readLine();
                answer = br.readLine();

                if (quiz == null || answer == null) {
                    break;
                }
                    System.out.println("(문제)" + quiz);
                    System.out.print(" 정답 입력 => ");
                    input = sc.next();
                if (answer.equals(input)) {
                    System.out.println("정답입니다!!!");
                } else {
                    System.out.println("틀렸습니다. 정답은 " + answer + "입니다.");
                }
            }

//            String line;
//            String answer;
//            while (true) {
//                line = br.readLine();
//                if (line == null) {
//                    break;
//                } else if (line.contains("__")) {
//                    System.out.println("(문제)" + line);
//                } else {
//                    System.out.print("정답 입력 => ");
//                    answer = sc.nextLine();
//                    if (line.equals(answer)) {
//                        System.out.println("정답입니다!!!");
//                    } else {
//                        System.out.println("틀렸습니다. 정답은 " + line + "입니다.");
//                    }
//                }
//            }
            System.out.println("---------------------------------------------------");
            System.out.println("모든 퀴즈가 완료되었습니다.");
            System.out.println("수고하셨습니다. ^^");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
