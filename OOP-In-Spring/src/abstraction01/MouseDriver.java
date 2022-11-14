package abstraction01;

public class MouseDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();

        mickey.name = "미키";
        mickey.age  = 85;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse("제리", 13, 1);
        System.out.println(jerry.name);
        System.out.println(jerry.age);
        System.out.println(jerry.countOfTail);



        jerry.sing();
    }
}

