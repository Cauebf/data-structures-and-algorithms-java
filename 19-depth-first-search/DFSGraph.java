// Extends Adjacency Matrix Graph
public class DFSGraph extends AMGraph {

    public DFSGraph(int size) {
        super(size);
    }

    public void depthFirstSearch(int src) {
        // keeps track of which nodes have already been visited
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {

        if (visited[src]) {
            System.out.println("  ↩ " + nodes.get(src).data + " (already visited)");
            return; // already visited this node, stop here (avoids infinite loop)
        }

        visited[src] = true; // mark current node as visited
        System.out.println("→ " + nodes.get(src).data + " (visited)");

        // check all possible neighbors of the current node
        for (int i = 0; i < matrix[src].length; i++) {
            // if there is an edge between the current node and the neighbor, visit it
            if (matrix[src][i] == 1) {
                dFSHelper(i, visited); // recursive call: go deeper into this neighbor first
            }
        }

        System.out.println("↩ " + nodes.get(src).data + " (backtrack)");
    }
}
