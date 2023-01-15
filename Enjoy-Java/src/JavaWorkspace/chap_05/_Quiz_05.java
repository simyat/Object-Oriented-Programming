package JavaWorkspace.chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // 예제 코드
        int sizeArray[] = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i);
        }

        for (int size:sizeArray) {
            System.out.println("사이즈 " + size + " (재고 있음)");
        }

//        내 코드
//        int size = 250;
//        int shoes_size[] = new int[10];
//        for (int i = 0; i < shoes_size.length; i++) {
//            shoes_size[i] = size;
//            if (shoes_size[i] < shoes_size[i] + 5){
//                size += 5;
//            }
//            System.out.println("사이즈 " + shoes_size[i] + " (재고 있음)");

//        }
    }
}

////            사이즈 250 (재고 있음)
////            사이즈 255 (재고 있음)
////            사이즈 260 (재고 있음)
////            사이즈 265 (재고 있음)
////            사이즈 270 (재고 있음)
////            사이즈 275 (재고 있음)
////            사이즈 280 (재고 있음)
////            사이즈 285 (재고 있음)
////            사이즈 290 (재고 있음)
////            사이즈 295 (재고 있음)
