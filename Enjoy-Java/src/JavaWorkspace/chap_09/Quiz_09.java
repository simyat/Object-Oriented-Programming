package JavaWorkspace.chap_09;

import java.util.ArrayList;
import java.util.List;

public class Quiz_09 {
    public static void main(String[] args) {
        student student[] = new student[5];

        for (int i = 0; i < student.length; i++) {
            student[i] = new student();
        }

        student[0].setName("유재석");
        student[0].setLicense("파이썬");

       student[1].setName("박명수");
        student[1].setLicense("자바");

        student[2].setName("김종국");
        student[2].setLicense("자바");

        student[3].setName("조세호");
        student[3].setLicense("C");

        student[4].setName("서장훈");
        student[4].setLicense("파이썬");

        ArrayList<student> list = new ArrayList<student>();
        list.add(student[0]);
        list.add(student[1]);
        list.add(student[2]);
        list.add(student[3]);
        list.add(student[4]);

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("----------------------");

        printLicense(list);


//        list.add(new student("유재석", "파이썬"));
//        list.add(new student("박명수", "자바"));

//        for (student student : list) {
//            if (student.license.equals("자바")) {
//                System.out.println(student.name);
//            }
//        }
    }

    public static void printLicense(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            student student = (student) o;
            String license = student.getLicense();

            if (license.equals("자바")) {
                System.out.println(student.getName());
            }
        }
    }
}

class student {

//    public String name;

//    public String license;

    private String name;
    private String license;

    public void setName(String name) {
        this.name = name;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public String getName() {
        return name;
    }
}
