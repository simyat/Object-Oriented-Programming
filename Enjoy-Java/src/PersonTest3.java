public class PersonTest3 {
    public static void main(String[] args) {
        System.out.println(Person.count);
        Person.printCount();

//        System.out.println(Person.name); // non-static variable name cannot be referenced from a static context
//        Person.printName(); // non-static method printName() cannot be referenced from a static context

//        Person p1 = new Person();
//        p1.name = "홍길동";
//
//        p1.printName();
//        Person.printCount();
//
//        Person.count++;
//        Person.printCount();
    }
}
