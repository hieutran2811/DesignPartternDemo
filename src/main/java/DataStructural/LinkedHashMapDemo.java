package DataStructural;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Java", 10);
        map.put("Python", 20);
        System.out.println(map); // {Java=10, Python=20}
    }
}
