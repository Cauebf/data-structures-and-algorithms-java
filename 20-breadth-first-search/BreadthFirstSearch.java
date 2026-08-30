public class BreadthFirstSearch {

    public static void main(String[] args) {

        // Breadth FS = Traverse a graph level by level
        //              Utilizes a Queue
        //              Better if a destination is on average close to start
        //              Siblings are visited before children

        // Depth FS =   Traverse a graph branch by branch
        //              Utilizes a Stack
        //              Better if destination is on average far from the start
        //              Children are visited before siblings
        //              More popular for game/puzzles

        // Adjacency Matrix Graph
        BFSGraph graph = new BFSGraph(5);
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

        // Breadth First Search
        System.out.println("\nBreadth First Search from node A");
        graph.breadthFirstSearch(0); // A → B → C → E → D

        System.out.println("\nBreadth First Search from node B");
        graph.breadthFirstSearch(1); // B → C → E → D → A

        System.out.println("\nBreath First Search from node D");
        graph.breadthFirstSearch(3); // D
    }
}
