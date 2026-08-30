import java.util.LinkedList;
import java.util.Queue;

// Extends Adjacency Matrix Graph
public class BFSGraph extends AMGraph {

    BFSGraph(int size) {
        super(size);
    }

    public void breadthFirstSearch(int src) {

        Queue<Integer> queue = new LinkedList<>(); // keeps track of nodes to visit next, in order
        boolean[] visited = new boolean[matrix.length]; // keeps track of which nodes have already been visited

        // add the starting node to the queue and mark it as visited
        queue.offer(src);
        visited[src] = true;

        // process the queue until it's empty
        while (queue.size() != 0) {

            // remove the front of the queue and visit it
            src = queue.poll();
            System.out.println("→ " + nodes.get(src).data + " (visited)");

            // check all possible neighbors of the current node
            for (int i = 0; i < matrix[src].length; i++) {
                if (matrix[src][i] == 1 && !visited[i]) {
                    // add unvisited neighbor to the queue and mark as visited
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
    }
}
