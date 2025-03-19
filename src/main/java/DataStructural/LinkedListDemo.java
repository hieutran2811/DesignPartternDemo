package DataStructural;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.addFirst(0); // Thêm vào đầu danh sách
        list.removeLast(); // Xóa phần tử cuối cùng
        System.out.println(list); // [0, 1]
    }
}
