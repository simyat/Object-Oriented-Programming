public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachine.printVersion();
        VendingMachine vm1 = new VendingMachine();
        VendingMachine vm2 = new VendingMachine();

        String product = vm1.pushProductButton(100);
        System.out.println(product);

        String product2 = vm2.pushProductButton(200);
        System.out.println(product2);

        // JVM은 VendingMachineMain 클래스 파일을 어디서 찾아서 실행할까?
        // JVM은 CLASSPATH 경로에서 클래스를 찾는다.
    }
}
