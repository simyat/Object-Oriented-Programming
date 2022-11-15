package singletonPattern;

public class MainEntry {
    public static void main(String[] args) {
        // King king = new King();
        King king = King.getInstance();

        king.say();


        King king2 = King.getInstance();
        if(king == king2){
            System.out.println("same Object");
        }else {
            System.out.println("different Object");
        }
    }
}
