public class UserExam {
    public static void main(String[] args) {
        User user = new User("test@naver.com", "inmo");
//        System.out.println(user.name);
        System.out.println(user);
        System.out.println("--------------------");

        User user2 = new User("test2@naver.com", "1234", "inmo2");
        System.out.println(user2.getEmail());
        System.out.println(user2.getName());
        System.out.println(user2.getPassword());
        System.out.println("--------------------");
        System.out.println(user2.toString());
    }
}
