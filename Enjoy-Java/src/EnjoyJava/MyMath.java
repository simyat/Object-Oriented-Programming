package EnjoyJava;

public class MyMath {
//     자동생성 - 기본생성자는 생성자가 없을 경우 컴파일 할 때 자동으로 생성된다.

//    private EnjoyJava.MyMath(){
//    생성자에 private을 붙이면 인스턴스를 생성할 수 없다. static 메소드만 있는 Math 클래스가 이런 경우이다.
//    }


    public static int abs(int x){
        if(x < 0){
            return x * -1;
        }else{
            return x;
        }
    }
}
