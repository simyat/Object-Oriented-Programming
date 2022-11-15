package factoryMethodPattern;

// 팩터리 메서드가 생성할 객체
public class DogToy extends AnimalToy {
    public void identify() {
        System.out.println("나는 테니스 공! 강아지 친구!");
    }
}
