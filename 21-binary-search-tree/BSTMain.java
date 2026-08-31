public class BSTMain {

    public static void main(String[] args) {

        // Binary Search Tree = A tree data structure, where each node is greater than it's left child,
        //		                but less than it's right.

        //					    Benefit: easy to locate a node when they are in this order

        //					    Time complexity: best case  O(log n)
        //									     worst case O(n)

        //					    Space complexity: O(n)


        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new BSTNode(5));
        tree.insert(new BSTNode(1));
        tree.insert(new BSTNode(9));
        tree.insert(new BSTNode(2));
        tree.insert(new BSTNode(7));
        tree.insert(new BSTNode(3));
        tree.insert(new BSTNode(6));
        tree.insert(new BSTNode(4));
        tree.insert(new BSTNode(8));

        System.out.println(tree.search(7)); // check if value 7 exists in the tree
        tree.remove(0); // try to remove a value that doesn't exist
        tree.remove(5); // remove value 5 from the tree
        tree.display();
    }
}
