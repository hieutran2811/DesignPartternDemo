package DataStructural;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        System.out.println(queue.poll()); // "A" (Lấy phần tử đầu tiên ra)
        System.out.println(queue.peek()); // "B" (Xem phần tử đầu tiên)
    }
}
