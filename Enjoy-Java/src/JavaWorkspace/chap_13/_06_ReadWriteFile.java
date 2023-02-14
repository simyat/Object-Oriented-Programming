package JavaWorkspace.chap_13;

import java.io.*;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용 읽어올 때
        // BufferedWriter : 파일에서 내용을 쓸 때

        // 파일 쓰기
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Java.txt", true))) {
////            bw.write("1. 마지막 챕터입니다.");
////            bw.newLine();
////            bw.write("2. 자바는 어려웟!");
////            bw.newLine();
//            bw.newLine();
//            bw.write("3. 하지만 자바는 중요해!");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        // 파일 읽기
        try (BufferedReader br = new BufferedReader(new FileReader("Java.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

//            while (br.ready()) {
//                System.out.println(br.readLine());
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
