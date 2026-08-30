public class AdjacencyList {

    public static void main(String[] args) {

        // Adjacency List = An array/arraylist of LinkedLists.
        //                  Each LinkedList has a unique node at the head.
        //                  All adjacent neighbors to that node are added to that node's LinkedList.

        // Runtime complexity to check an Edge: O(V)
        // Space complexity: O(V + E)

        AdjacencyListGraph adjacencyListGraph = new AdjacencyListGraph();

        adjacencyListGraph.addNode(new AdjacencyListNode('A'));
        adjacencyListGraph.addNode(new AdjacencyListNode('B'));
        adjacencyListGraph.addNode(new AdjacencyListNode('C'));
        adjacencyListGraph.addNode(new AdjacencyListNode('D'));
        adjacencyListGraph.addNode(new AdjacencyListNode('E'));

        // add edges between nodes (by index)
        adjacencyListGraph.addEdge(0, 1); // A -> B
        adjacencyListGraph.addEdge(1, 2); // B -> C
        adjacencyListGraph.addEdge(1, 4); // B -> E
        adjacencyListGraph.addEdge(2, 3); // C -> D
        adjacencyListGraph.addEdge(2, 4); // C -> E
        adjacencyListGraph.addEdge(4, 0); // E -> A
        adjacencyListGraph.addEdge(4, 2); // E -> C

        adjacencyListGraph.print();

        System.out.println(adjacencyListGraph.checkEdge(0, 1)); // check if there's an edge from A to B
    }
}
