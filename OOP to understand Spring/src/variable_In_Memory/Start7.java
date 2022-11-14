package variable_In_Memory;

import java.util.Arrays;

public class Start7 {
    public static void main(String[] args) {
        int[] man = new int[3];
        man = people(26, 170, 50);
        System.out.println(Arrays.toString(man));
    }

    public static int[] people(int age, int height, int weight){
        int[] people = {age, height, weight};
        return people;
    }
}