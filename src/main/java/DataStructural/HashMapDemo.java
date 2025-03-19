package DataStructural;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Java", 10);
        map.put("Python", 20);
        map.put("Python", 30);
        System.out.println(map.get("Java")); // 10
        System.out.println(map.get("Python")); // 10
    }
}
