package abstractMethod01;

interface Speakable {
    public static final double PI = 3.14159;
    public static final double absoluteZeroPoint = -275.15;

    public abstract void sayYes();
}

class Speaker implements Speakable{
    public void sayYes(){
        System.out.println("I say No!!");
    }
}

public class Driver{
    public static void main(String[] args) {
        System.out.println(Speakable.absoluteZeroPoint);
        System.out.println(Speakable.PI);

        Speaker reporter1 = new Speaker();
        reporter1.sayYes();
    }
}
