package abstraction01;

public class Mouse {
    public String name;
    public int age;
    public int countOfTail = 1;


    Mouse(){
    }
    Mouse(String name, int age, int countOfTail){
        this.name = name;
        this.age = age;
        this.countOfTail = countOfTail;
    }

    public void sing(){
        System.out.println(name + " 찍찍 !!");
    }
}
