package decoratorPattern;

public class Decorator implements IService{
    IService service;

    public String runSomething(){
        System.out.println("호출에 대한 장식 주목적, 클라이언트에게 반환 결과에 장식 더해 전달");

        service = new Service();
        return "정말" + service.runSomething();
    }
}
