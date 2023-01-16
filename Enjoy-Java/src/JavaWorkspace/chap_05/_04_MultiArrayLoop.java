package JavaWorkspace.chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        String[][] seats2 = new String[][]{
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        String[][] seats3 = new String[10][15];

//        for (int i = 0; i < seats2.length; i++) {
//            for (int j = 0; j < seats2[i].length; j++) {
//                System.out.print(seats2[i][j] + " ");
//            }
//            System.out.println( );
//        }

        System.out.println("-----------------------------");

        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
//                seats3[i][j] = Character.toString((char) 65 + i) + (j + 1);
                seats3[i][j] = String.valueOf(ch) + (j+1);
                System.out.print(seats3[i][j] + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
