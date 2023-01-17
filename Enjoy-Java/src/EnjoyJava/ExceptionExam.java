package EnjoyJava;

public class ExceptionExam {
    public static void main(String[] args) {
        try {
            ExceptionExample();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            System.out.println("예외 : " + ex.getMessage());
        }
    }

    private static void ExceptionExample() throws ArrayIndexOutOfBoundsException {
        int arr[] = new int[3];
        System.out.println(arr[3]);
    }
}

class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}