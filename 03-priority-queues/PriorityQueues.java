import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {

    public static void main(String[] args) {

        // priority queue = A FIFO data structure that serves elements
        //                  with higher priority are served first
        //                  before elements with lower priority

        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.0);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.5);

        queue.poll(); // 1.5 (lowest priority)

        // reverse order
        Queue<Double> queueReverse = new PriorityQueue<>(Collections.reverseOrder());

        queueReverse.offer(3.0);
        queueReverse.offer(4.0);
        queueReverse.offer(1.5);
        queueReverse.offer(2.5);

        queueReverse.poll(); // 4.0 (highest priority)

        // string
        Queue<String> queueString = new PriorityQueue<>();

        queueString.offer("C");
        queueString.offer("A");
        queueString.offer("B");

        queueString.poll(); // A (lowest priority, first alphabetically)
    }
}
