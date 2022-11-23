package encapsulation01.packageOne;

public class Main {
    public static void main(String[] args) {
        ClassA.runStaticThing();
        // ClassA.pub;
        ClassA a = new ClassA();
        // ClassA.runSomething();
        a.runSomething();
    }
}
