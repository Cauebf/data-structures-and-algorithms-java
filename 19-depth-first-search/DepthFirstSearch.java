public class DepthFirstSearch {

    public static void main(String[] args) {

        // Depth First Search = Pick a route, keep going.
        //                      If you reach a dead end, or an already visited node,
        //                      backtrack to a previous node with unvisited adjacent neighbors

        // Adjacency Matrix Graph
        DFSGraph graph = new DFSGraph(5);
        graph.addNode(new AMNode('A'));
        graph.addNode(new AMNode('B'));
        graph.addNode(new AMNode('C'));
        graph.addNode(new AMNode('D'));
        graph.addNode(new AMNode('E'));
        graph.addEdge(0, 1); // A -> B
        graph.addEdge(1, 2); // B -> C
        graph.addEdge(1, 4); // B -> E
        graph.addEdge(2, 3); // C -> D
        graph.addEdge(2, 4); // C -> E
        graph.addEdge(4, 0); // E -> A
        graph.addEdge(4, 2); // E -> C
        graph.print();

        // Depth First Search
        System.out.println("\nDepth First Search from node A:");
        graph.depthFirstSearch(0); // A → B → C → D ↩ C → E ↩ B ↩ A

        System.out.println("\nDepth First Search from node B:");
        graph.depthFirstSearch(1); // B → C → D ↩ C → E → A ↩ E ↩ C ↩ B

        System.out.println("\nDepth First Search from node D:");
        graph.depthFirstSearch(3); // D
    }
}
