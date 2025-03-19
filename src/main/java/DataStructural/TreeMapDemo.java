package DataStructural;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("C++", 15);
        map.put("Java", 10);
        System.out.println(map); // {C++=15, Java=10} (Sắp xếp theo key)

    }
}
