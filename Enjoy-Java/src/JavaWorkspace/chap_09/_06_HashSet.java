package JavaWorkspace.chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    // Set 중복 허용 안함, 순서 보장 안함
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        for (String s : set
        ) {
            System.out.println(s);
        }

        System.out.println("-----------------");

        // 확인
        if (set.contains("삼겹살")) {
            System.out.println("삼겹살 사러 출발");
        }
        System.out.println("-------------------");

        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size()); // 6
        set.remove("삼겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size()); // 5
        System.out.println("---------------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("----------------------");

        HashSet<Integer> intSet = new HashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet
        ) {
            // 중복 X, 순서 보장 X
            System.out.println(i); // 1 2 13
        }

        System.out.println("---------------------");

        HashSet<Integer> intLinkedHashSet = new LinkedHashSet<>();
        intLinkedHashSet.add(1);
        intLinkedHashSet.add(13);
        intLinkedHashSet.add(13);
        intLinkedHashSet.add(2);

        for (int i : intLinkedHashSet
        ) {
            // 중복 X 순서 보장 O
            System.out.println(i); // 1 13 2
        }
    }
}
