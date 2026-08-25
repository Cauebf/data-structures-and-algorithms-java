import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {

        // LinkedList = stores Nodes in 2 parts (data + address)
        //              Nodes are in non-consecutive memory locations
        //              Elements are linked by pointers; no index

        //                        Single LinkedList
        //          Node                Node               Node
        //    [data | address] -> [data | address] -> [data | null]

        //                        Double LinkedList
        //            Node                           Node                          Node
        //    [null | data | address] <-> [address | data | address] <-> [address | data | null]

        // Advantages:
        // 1. Dynamic Data Structure (allocates needed memory while running)
        // 2. Insertion and Deletion of Nodes is easy. O(1)
        // 3. No/Low memory waste

        // Disadvantages:
        // 1. Greater memory usage (additional pointer)
        // 2. No random access of elements (no index, need to traverse the entire list)
        // 3. Accessing/searching elements is more time-consuming. O(n)

        // Uses:
        // 1. implement Stacks/Queues
        // 2. GPS Navigation
        // 3. music playlist

        LinkedList<String> linkedList = new LinkedList<>();

        // Treating LinkedList as Stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.pop();
        System.out.println(linkedList); // [C, B, A]
        linkedList.clear();

        // Treating LinkedList as Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.poll();
        System.out.println(linkedList); // [B, C, D, F]

        // Inserting and removing elements
        linkedList.addLast("0");
        linkedList.addFirst("G");
        linkedList.removeLast();
        linkedList.removeFirst();
        linkedList.add(2, "E");
        linkedList.remove("F");
        System.out.println(linkedList); // [B, C, E, D]
        System.out.println(linkedList.indexOf("E")); // 2
        System.out.println(linkedList.peekFirst()); // B
        System.out.println(linkedList.peekLast()); // D
    }
}
