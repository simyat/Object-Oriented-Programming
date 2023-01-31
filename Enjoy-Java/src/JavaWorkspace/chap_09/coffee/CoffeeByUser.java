package JavaWorkspace.chap_09.coffee;

import JavaWorkspace.chap_09.user.User;

public class CoffeeByUser <T extends User>{
    //    User 또는 User를 상속받은 class만
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
