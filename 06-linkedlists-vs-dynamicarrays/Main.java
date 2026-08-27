import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        // populate
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // *************** LinkedList ***************
        startTime = System.nanoTime();

        // Accessing elements
        linkedList.get(0);      // O(1) ~ 20-50 ns: first node is directly accessible
        linkedList.get(500000); // O(n) ~ 1-5 ms: need to traverse 500000 nodes
        linkedList.get(999999); // O(1) ~ 20-50 ns: traverses from the tail

        // Removing elements
        linkedList.remove(0);       // O(1) ~ 20-100 ns: removes the first node
        linkedList.remove(500000);  // O(n) ~ 1-5 ms: need to traverse 500000 nodes
        linkedList.remove(999999);  // O(1) ~ 20-100 ns: removes the last node from the tail

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        // *************** ArrayList ****************
        startTime = System.nanoTime();

        // Accessing elements
        arrayList.get(0);       // O(1) ~ 10-30 ns: direct access by index
        arrayList.get(500000);  // O(1) ~ 10-30 ns: direct access by index
        arrayList.get(999999);  // O(1) ~ 10-30 ns: direct access by index

        // Removing elements
        arrayList.remove(0);        // O(n) ~ 0.1-1 ms: shifts almost all elements
        arrayList.remove(500000);   // O(n) ~ 0.05-0.5 ms: shifts elements after index 500000
        arrayList.remove(999999);   // O(1) ~ 20-100 ns: removes the last element, no shifting

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}
