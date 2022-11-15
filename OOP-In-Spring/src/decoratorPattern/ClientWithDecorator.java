package decoratorPattern;

public class ClientWithDecorator {
    public static void main(String[] args) {
        IService Decorator = new Decorator();
        System.out.println(Decorator.runSomething());
    }
}
