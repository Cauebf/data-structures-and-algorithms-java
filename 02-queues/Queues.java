import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args) {

        // queue = FIFO (First In First Out)
        //         A collection designed for holding elements prior to processing
        //         Linear data structure
        //         add = enqueue, offer()
        //         remove = dequeue, poll()

        // Queue<String> queue = new Queue<>(); // Queue is an interface, so it's not possible to instantiate it
        Queue<String> queue = new LinkedList<>(); // LinkedList implements Queue

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");

        queue.poll();

        System.out.println(queue.peek()); // B
        System.out.println(queue.isEmpty()); // false
        System.out.println(queue.size()); // 3
        System.out.println(queue.contains("C")); // true

        queue.offer("E");

        System.out.println(queue); // [B, C, D, E]

        // Uses of queues
        //      1. Keyboard Buffer (letters should appear on the screen in the order they’re pressed, if you’re typing fast)
        //      2. Printer Queue (Print jobs should be completed in order)
        //      3. Used in LinkedLists, PriorityQueues, Breadth-first search
    }
}
