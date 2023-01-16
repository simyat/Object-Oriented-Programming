package JavaWorkspace.chap_07;

public class AccessModifierClass {
    public AccessModifierClass(){
        System.out.println("public Class!!");
    }
}

class A {
    public A(){
        System.out.println("default class!!");
    }
}

// private class B {
//    Modifier 'private' not allowed here
// }

//protected class C {
//    public C() {
//        Modifier 'protected' not allowed here
//    }
//}