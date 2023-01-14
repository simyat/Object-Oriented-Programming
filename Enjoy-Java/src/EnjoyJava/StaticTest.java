package EnjoyJava;

public class StaticTest {
    static int myStaticVariable = 100;
    int myVariable = 200;

    public void myMethod() {
        myStaticVariable++;
        myVariable++;
        System.out.println(myStaticVariable);
        System.out.println(myVariable);
    }

    public static void myStaticMethod() {
        myStaticVariable = 3;
//        myVariable = 4; // non-static field 'myVariable' cannot be referenced from static context
    }
}
