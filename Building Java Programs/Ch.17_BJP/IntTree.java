// Simple binary tree class that includes methods to construct a tree of ints, to print
// the structure, and to print the data using preorder, inorder, or postorder traversal.
// The trees built have nodes numbered starting with 1 and numbered sequentially level
// by level with no gaps in the tree. The documentation refers to these as "sequential
// trees."

public class IntTree {
    private IntTreeNode overallRoot;

    // pre: max >= 0 (throws new IllegalArgumentException if not)
    // post: constructs a sequential tree with given number of nodes
    public IntTree(int max) {
        if (max < 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless n is greater than
    // max, in which case it returns an empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max), buildTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one pre line, following an inorder traversal
    // and using indentation to indicate node depth; prints right to left so that it
    // looks correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given root, indenting each line
    // to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("      ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }

    public int sum() {
        return sum(overallRoot);
    }

    private int sum(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.data + sum(root.left) + sum(root.right);
        }
    }

    public int countLevels() {
        return countLevels(overallRoot);
    }

    private int countLevels(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(countLevels(root.left), countLevels(root.right));
        }
    }

    public int countLeaves() {
        return countLeaves(overallRoot);
    }

    private int countLeaves(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeaves(root.left) + countLeaves(root.right);
        }
    }

    // Exercise 1:
    // Write a method called countLeftNodes that returns the number of left children in the tree.
    // A left child is a node that appears as the root of the left hand subtree of another node.
    public int countLeftNodes() {
        return countLeftNodes(overallRoot);
    }

    private int countLeftNodes(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null) {
            return 1;
        } else if (root.left != null) {
            return 1 + countLeftNodes(root.left) + countLeftNodes(root.right);
        } else {
            return countLeftNodes(root.left) + countLeftNodes(root.right);
        }
    }

    // Exercise 2:
    // Write a method called countEmpty that returns the number of empty branches in a tree. An
    // empty tree is considered to have empty branch (the tree itself). For non empty trees, your
    // method should count the total number of empty branches amoung the nodes of the tree.
    public int countEmpty() {
        return countEmpty(overallRoot);
    }

    private int countEmpty(IntTreeNode root) {
        if (root == null) {
            return 1;
        } else {
            return countEmpty(root.left) + countEmpty(root.right);
        }
    }

    // Exercise 3:
    // Write a method called depthSum that returns the sum of the values stored in a binary
    // tree of integers weighted by the depth of each value. The method should return the value
    // at the root, plus 2 times the values stored at next level of tree, plus 3 times the values
    // stored at the next level of the tree, and so on.
    public int depthSum() {
        return depthSum(overallRoot, 1);
    }

    private int depthSum(IntTreeNode root, int level) {
        if (root == null) {
            return 0;
        } else {
            return level * root.data + (depthSum(root.left, level + 1) + depthSum(root.right, level + 1));
        }
    }

    // Exercise 4:
    // Write a method called countEvenBranches that returns the number of branch nodes in a
    // binary tree that contains even numbers. A branch node has one or two children.
    public int countEvenBranches() {
        return countEvenBranches(overallRoot);
    }

    private int countEvenBranches(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root.data % 2 == 0  && (root.left != null || root.right != null)) {
            return 1 + countEvenBranches(root.left) + countEvenBranches(root.right);
        } else {
            return countEvenBranches(root.left) + countEvenBranches(root.right);
        }
    }

    // Exercise 5:
    // Write a method called printLevel that accepts an integer parameter n and prints the values
    // at level n from left to right, one per line. We will use the convention that the overall
    // root is at level 1, its children are at level 2, and so on.
    public void printLevel(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        printLevel(overallRoot, n);
    }

    private void printLevel(IntTreeNode root, int n) {
        if (root == null) {
            return;
        } else if (n == 1) {
            System.out.println(root.data);
            return;
        } else {
            printLevel(root.left, n - 1);
            printLevel(root.right, n - 1);
        }
    }

    // Exercise 6:
    // Write a method called printLeaves that prints to System.out the leaves of a binary tree
    // from left to right. More specifically, the leaves should be printed in the reverse order
    // that would be printed using any of the standard traversals. If the tree is empty,
    // your method should produce the output "no leaves".
    public void printLeaves() {
        if (overallRoot == null) {
            System.out.println("no leaves");
            return;
        } else {
            System.out.print("leaves:");
            printLeaves(overallRoot);
    
        }
    }

    private void printLeaves(IntTreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            System.out.print(" " + root.data);
            return;
        }
        printLeaves(root.right);
        printLeaves(root.left);
    }

    // Exercise 7:
    // Write a method called isFull that returns true if a binary tree is full and false
    // if it is not. A full binary tree is one in which every node has 0 or 2 children.
    public boolean isFull() {
        return isFull(overallRoot);
    }

    private boolean isFull(IntTreeNode root) {
        if (root == null) {
            return true;
        } else if (root.left != null && root.right == null) {
            return false;
        } else if (root.left == null && root.right != null) {
            return false;
        }
        return isFull(root.left) && isFull(root.right);
    }

    // Exercise 8:
    // Write a toString method for a binary tree of integers. The method should return "empty"
    // for an empty tree. For a leaf node, it should return the data in the node as a string/
    // For a branch node, it should return a parenthesized String that has three elements
    // separated by commas: the data at the root, a string representation of the left subtree,
    // and then a string representation of the right subtree.
    public String toString2() {
        return toString2(overallRoot);
    }
    
    private String toString2(IntTreeNode root) {
        if (root == null) {
            return "empty";
        } else if (root.left == null && root.right == null) {
            return String.valueOf(root.data);
        } else {
            return "(" + root.data + ", " + toString2(root.left) + ", " + toString2(root.right) + ")";
        }
    }

    // Exercise 9:
    // Write a method called equals that accepts another binary tree of integers as a parameter
    // and compares the two trees to see whether they are equal to each other.
    public boolean equals(IntTree tree2) {
        return equals(overallRoot, tree2.overallRoot);
    }
    
    private boolean equals(IntTreeNode root, IntTreeNode root2) {
        if (root == null && root2 == null) {
            return true;
        } else if (root.left.data != root2.left.data || root.right.data != root2.right.data) {
            return false;
        } else if (root.left == root2.left && root.right == root2.right) {
            return equals(root.left, root2.left) && equals(root.right, root2.right);
        }
        return true;
    }

    // Exercise 10:
    // Write a method called doublePositives that doubles all data values greater than 0 in
    // a binary tree of integers.
    public int doublePositives() {
        return doublePositives(overallRoot);
    }
    
    private int doublePositives(IntTreeNode root) {
        if (root == null) {
            return 0;
        } else if (root != null && root.data > 0) {
            root.data = 2 * root.data;
            return doublePositives(root.left) + doublePositives(root.right);
        } else {
            return doublePositives(root.left) + doublePositives(root.right);
        }
    }

    // Exercise 11:
    // Write a method called numberNodes that changes the data stored in a binary tree, assigning
    // sequential integers starting with 1 to each node so that a preorder traversal will produce
    // the numbers in order (1, 2, 3, etc.).
}
