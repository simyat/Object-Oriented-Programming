package JavaWorkspace.chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류 : 컴파일 오류, 런타임 오류 (에러 error - 소스코드를 통해서 수습할 수 없음 스택오버플로우, 아웃오브메모리에러 등 / 예외 exception 소스코드, 예외처리를 통해 수습이 가능함 배열 인덱스 초과, 객체 초기화 시 null)
//        int i = "문자열"; 컴파일 오류
//        int arr[] = new int[3];
//        arr[5] = 100; ArrayIndexOutOfBoundsException
//        S s = new S();
//        s.methodA(); StackOverflowError

        try {
//            System.out.println(3 / 0);

//            int arr[] = new int[3];
//            arr[5] = 100;
            Object obj = "tset";
            System.out.println((int) obj);

        } catch (Exception e) {
            System.out.println("이런 문제가 발생했어요 => " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}

//class S {
//    public void methodA() {
//        this.methodA();
//    }
//}