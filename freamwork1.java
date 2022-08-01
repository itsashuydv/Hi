import java.util.*;

public class freamwork1 {

    public static void main(String[] args) {

        // Linked List

        LinkedList<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(8);
        list.add(10);
        list.add(20);

        list.removeLast();
        System.out.println();
        // for (int i = 0; i < list.size(); i++) {

        // System.out.print(list.get(i) + " ");

        // }
        while (!list.isEmpty()) {

            System.out.println(list.peek());
            list.remove();

        }

        System.out.println();

        // ArrayDeque

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.push(10);
        deque.push(20);
        deque.push(40);
        deque.push(50);

        while (!deque.isEmpty()) {
            System.out.println(deque.peek());
            deque.pop();
        }

        // Stack
        System.out.println("Stack");
        Stack<Integer> n = new Stack<>();
        n.push(7);
        n.push(2);
        n.push(10);
        n.push(9);
        while (!n.isEmpty()) {

            System.out.println(n.peek());
            n.pop();

        }

        // queue
        System.out.println("Queue");
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);

        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.remove();

        }
    }
}
