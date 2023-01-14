package EnjoyJava;

public class User {
    private String email;
    private String password;
    private String name;

    // 생성자를 하나라도 만들면 기본 생성자가 만들어지지 않는다.
//    getter만 가지고 있어 생성자가 받은 값을 바꿀 수 없는 객체를 불변객체라 부른다.
    // 자신의 생성자를 호출할 때는 this() 사용
//    this는 인스턴스 자기 자신을 참조할 때 사용한다.
//    this()생성자는 생성자 안에서만 사용 가능하고 this()생성자는 생성자 안에서 super() 생성자를 호출하는 코드 다음이나, 첫번째 줄에 위치해야 한다.

    public User(String email, String name){
        this(email, null, name);
    }

    public User(String email, String password, String name) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "EnjoyJava.User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
