package BinarySeachTree;
public class SearchKey {
    private TreeNode root;

    public class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void inorder() {
        inorder(root);
    }

    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public TreeNode searh(int key){
        return search(root, key);
    }

    public TreeNode search(TreeNode root ,int key) {
        if (root == null || root.data == key) {
            return root;
        }
        if (key < root.data) {
            return search(root.left, key);
        } else{
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        SearchKey bst = new SearchKey();
        bst.insert(50);
        bst.insert(45);
        bst.insert(40);
        bst.insert(46);
        bst.insert(55);
        bst.insert(54);
        bst.insert(60);

        bst.inorder();

        System.out.println(" ");

        if (null != bst.searh(5)) {
            System.out.println("Key Found !!!");
        } else{
            System.out.println("Key not found !!!");
        }
    }
}
