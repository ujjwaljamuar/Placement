package BinaryTree;

public class RecursivePreOrder {
    private TreeNode root;

    private class TreeNode {
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree() {
        TreeNode first   = new TreeNode(1);
        TreeNode second  = new TreeNode(2);
        TreeNode third   = new TreeNode(3);
        TreeNode fourth  = new TreeNode(4);
        TreeNode fifth   = new TreeNode(5);

        root = first;                                   // root --> first
        first.left = second;
        first.right = third;                           // second <-- first --> third

        second.left = fourth;
        second.right = fifth;                          // fourth <-- third --> fifth

    }

    public void PreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {
        RecursivePreOrder bt = new RecursivePreOrder();
         bt.createBinaryTree();
         bt.PreOrder(bt.root);
    }
}
