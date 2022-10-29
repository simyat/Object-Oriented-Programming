import java.util.Scanner;

public class GugudanMain{
    public void gugudanProgram(){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("출력할 구구단을 입력하세요, 종료하려면 0을 입력하세요 : ");
            String inputValue = sc.nextLine();
            if(inputValue.equals("0")){
                System.out.println("종료합니다. ");
                break;
            }
            String[] num = inputValue.split(",");

            int num1 = Integer.parseInt(num[0]);
            int num2 = Integer.parseInt(num[1]);

            calc(num1, num2);
        }
    }

    public void calc(int num1, int num2) {
        for (int i = 2; i <= num1; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= num2; j++) {
                int result = i * j;
                System.out.println("\t" + result);
            }
        }
    }


}