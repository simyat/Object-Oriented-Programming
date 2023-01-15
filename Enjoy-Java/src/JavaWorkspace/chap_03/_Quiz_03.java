package JavaWorkspace.chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String num1 = "901231-1234567";
        String num2 = "030708-4567890";
        num1 = num1.substring(0, 8);
        System.out.println(num1); // 901231-1
        num2 = num2.substring(0, num2.indexOf("-") + 2);
        System.out.println(num2); // 030708-4
    }
}
