package EnjoyJava;

public class PersonTest3 {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.printCount();

//        System.out.println(EnjoyJava.Person.name); // non-static variable name cannot be referenced from a static context
//        EnjoyJava.Person.printName(); // non-static method printName() cannot be referenced from a static context

//        EnjoyJava.Person p1 = new EnjoyJava.Person();
//        p1.name = "홍길동";
//
//        p1.printName();
//        EnjoyJava.Person.printCount();
//
//        EnjoyJava.Person.count++;
//        EnjoyJava.Person.printCount();
    }
}
