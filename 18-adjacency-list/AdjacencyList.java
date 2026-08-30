public class AdjacencyList {

    public static void main(String[] args) {

        // Adjacency List = An array/arraylist of LinkedLists.
        //                  Each LinkedList has a unique node at the head.
        //                  All adjacent neighbors to that node are added to that node's LinkedList.

        // Runtime complexity to check an Edge: O(V)
        // Space complexity: O(V + E)

        ALGraph graph = new ALGraph();

        graph.addNode(new ALNode('A'));
        graph.addNode(new ALNode('B'));
        graph.addNode(new ALNode('C'));
        graph.addNode(new ALNode('D'));
        graph.addNode(new ALNode('E'));

        // add edges between nodes (by index)
        graph.addEdge(0, 1); // A -> B
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(1, 4); // B -> E
        graph.addEdge(2, 3); // C -> D
        graph.addEdge(2, 4); // C -> E
        graph.addEdge(4, 0); // E -> A
        graph.addEdge(4, 2); // E -> C

        graph.print();

        System.out.println(graph.checkEdge(0, 1)); // check if there's an edge from A to B
    }
}
