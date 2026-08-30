import java.util.ArrayList;

public class AMGraph {

    ArrayList<AMNode> nodes;
    int[][] matrix; // 2d array representing the adjacency matrix

    AMGraph(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size]; // size x size matrix, all values start at 0
    }

    public void addNode(AMNode node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1; // mark 1 to indicate there's an edge from src to dst
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return  true; // edge exists
        } else  {
            return false; // no edge
        }
    }

    public void print() {

        // print column headers (node data)
        System.out.print("  ");
        for (AMNode node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        // print each row with its node label followed by 0's and 1's
        for (int i = 0; i < matrix.length; i++) {

            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
