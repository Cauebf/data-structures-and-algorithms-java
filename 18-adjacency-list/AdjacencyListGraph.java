import java.util.ArrayList;
import java.util.LinkedList;

public class AdjacencyListGraph {

    ArrayList<LinkedList<AdjacencyListNode>> alist; // list of linked lists, one per node

    AdjacencyListGraph() {
        alist = new ArrayList<>();
    }

    public void addNode(AdjacencyListNode adjacencyListNode) {
        // create a new linked list with this node as the head
        LinkedList<AdjacencyListNode> currentList = new LinkedList<>();
        currentList.add(adjacencyListNode);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        // get the linked list belonging to the source node
        LinkedList<AdjacencyListNode> currentList = alist.get(src);
        // get the destination node (always the head of its own list)
        AdjacencyListNode dstAdjacencyListNode = alist.get(dst).get(0);
        // add the destination node as an adjacent neighbor of src
        currentList.add(dstAdjacencyListNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<AdjacencyListNode> currentList = alist.get(src);
        AdjacencyListNode dstAdjacencyListNode = alist.get(dst).get(0);

        // search linearly through src's linked list looking for dstNode
        for (AdjacencyListNode adjacencyListNode : currentList) {
            if (adjacencyListNode == dstAdjacencyListNode) {
                return true; // edge exists
            }
        }
        return false; // no edge found
    }

    public void print() {

        // print each node's linked list of adjacent neighbors
        for (LinkedList<AdjacencyListNode> currentList : alist) {

            for (AdjacencyListNode adjacencyListNode : currentList) {
                System.out.print(adjacencyListNode.data + " -> ");
            }
            System.out.println();
        }
    }
}
