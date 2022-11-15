package proxyPattern;

public class ProxyService implements IService{
    @Override
    public String runSomething() {
        return "서비스 짱!!";
    }
}
