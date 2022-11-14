package variable_In_Memory;

public class Start5 {
    static int share;

    public static void main(String[] args) {
        share = 55;

        int k = fun(5, 7);

        System.out.println(share);

//        People inmo = new People();
//        inmo.name= "inmo";
//        System.out.println(inmo.name);
//        inmo = null;
//        System.out.println(inmo.name);
    }

    private static int fun(int m, int p ){
        share = m + p;

        return m - p;
    }
}

class People{
    String name;
}
