package EnjoyJava;

public class BookExam01 {
    public static void main(String[] args) {
        Book b1 = new Book();
//        b1.price = 100;
//        System.out.println(b1.price);
        b1.setPrice(100);
        System.out.println(b1.getPrice());

        b1.setTitle("김성박의 즐거운 자바");
        System.out.println(b1.getTitle());
    }
}
