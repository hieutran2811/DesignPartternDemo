package DataStructural;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1); // Không thêm phần tử trùng lặp
        System.out.println(set); // [1, 2]

    }
}
