public class BinarySearchTree {

    BSTNode root;

    public void insert(BSTNode node) {
        root = insertHelper(root, node);
    }

    private BSTNode insertHelper(BSTNode root, BSTNode node) {

        int data = node.data;

        if (root == null) {
            root = node; // found the empty spot, insert here
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node); // smaller values go left
        } else {
            root.right = insertHelper(root.right, node); // larger values go right
        }

        return root;
    }

    public void display() {
        displayHelper(root);
    }

    private void displayHelper(BSTNode root) {

        // in-order traversal: left, root, right -> prints values in crescent order
        if (root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(BSTNode root, int data) {

        if (root == null) {
            return false; // reached the end without finding it
        } else if (root.data == data) {
            return true; // found it
        } else if (root.data > data) {
            return searchHelper(root.left, data); // go left if target is smaller
        } else {
            return searchHelper(root.right, data); // go right if target is larger
        }
    }

    public void remove(int data) {

        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found");
        }
    }

    private BSTNode removeHelper(BSTNode root, int data) {

        if (root == null) {
            return root;
        } else if (data < root.data) {
            // search left subtree
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            // search right subtree
            root.right = removeHelper(root.right, data);
        } else { // node found

            if (root.left == null && root.right == null) {
                // no children, just remove the node
                root = null;
            } else if (root.right != null) {
                // has a right child, use the successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data); // Remove the original successor
            } else {
                // no right child, use the predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data); // Remove the original predecessor
            }
        }

        return root;
    }

    private int successor(BSTNode root) {
        // find the smallest value in the right subtree
        root = root.right;

        // keep going left to find the smallest value
        while (root.left != null) {
            root = root.left;
        }

        return root.data;
    }

    private int predecessor(BSTNode root) {
        // find the largest value in the left subtree
        root = root.left;

        // Keep going right to find the largest value
        while (root.right != null) {
            root = root.right;
        }

        return root.data;
    }
}