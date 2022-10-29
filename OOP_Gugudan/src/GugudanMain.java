import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        GugudanMain main = new GugudanMain();
        main.gugudanProgram();
    }


}

class GugudanMain{
    public void gugudanProgram(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("출력할 구구단을 입력하세요, 종료하려면 0을 입력하세요 : ");
            int num = sc.nextInt();
            if(num >= 2 && num <= 9){
                calc(num);
            } else if (num == 0) {
                System.out.println("구구단을 종료합니다. ");
                break;
            } else {
                System.out.println("2이상, 9 이하 값만 입력할 수 있습니다.");
            }
        }
    }

    public void calc(int num) {
        int[] result = new int[9];
        for (int j = 0; j < result.length; j++) {
            result[j] = num * (j+1);
        }
        print(result);
    }

    public void print(int[] result){
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}