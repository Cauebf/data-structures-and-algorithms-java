import java.util.ArrayList;
import java.util.LinkedList;

public class ALGraph {

    ArrayList<LinkedList<ALNode>> alist; // list of linked lists, one per node

    ALGraph() {
        alist = new ArrayList<>();
    }

    public void addNode(ALNode node) {
        // create a new linked list with this node as the head
        LinkedList<ALNode> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst) {
        // get the linked list belonging to the source node
        LinkedList<ALNode> currentList = alist.get(src);
        // get the destination node (always the head of its own list)
        ALNode dstNode = alist.get(dst).get(0);
        // add the destination node as an adjacent neighbor of src
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<ALNode> currentList = alist.get(src);
        ALNode dstNode = alist.get(dst).get(0);

        // search linearly through src's linked list looking for dstNode
        for (ALNode node : currentList) {
            if (node == dstNode) {
                return true; // edge exists
            }
        }
        return false; // no edge found
    }

    public void print() {

        // print each node's linked list of adjacent neighbors
        for (LinkedList<ALNode> currentList : alist) {

            for (ALNode node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
