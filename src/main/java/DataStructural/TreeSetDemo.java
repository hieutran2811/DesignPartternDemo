package DataStructural;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(8);
        System.out.println(set); // [2, 5, 8] (Được sắp xếp tự động)
    }
}
