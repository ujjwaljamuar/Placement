package BinaryTree;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class FIndMax {
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

    public void RecursePreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        RecursePreOrder(root.left);
        RecursePreOrder(root.right);
    }

    public void IteratePreOrder() {
        if (root == null) {
            return;
        }
        Stack <TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null){
                stack.push(temp.right);
            }

            if (temp.left != null){
                stack.push(temp.left);
            }
        }
    }

    public void RecInorder(TreeNode root){
        if(root == null){
            return;
        }
        RecInorder(root.left);
        System.out.print(root.data + " ");
        RecInorder(root.right);
    }

    public void IterInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        Stack <TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        
        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            }
            else{              
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void RecPostOrder(TreeNode root) {
		if(root == null) {
			return;
		}

		RecPostOrder(root.left);
		RecPostOrder(root.right);
		System.out.print(root.data + " ");
	}

    public void IterPostOrder(){
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();

		while(current != null || !stack.isEmpty()){
			if(current != null){
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if(temp == null){
					temp = stack.pop();
					System.out.print(temp.data + " ");
					while(!stack.isEmpty() && temp == stack.peek().right){
						temp = stack.pop();
						System.out.print(temp.data + " ");
					}
				} else {
					current = temp;
				}
			}
		}
	}

    public void LevelOrd(){
        if(root == null) {
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null) {
				queue.offer(temp.left);
			}
			if(temp.right != null) {
				queue.offer(temp.right);
			}
		}
    }

    public int findmax(){
        return findmax(root);
    }

    public int findmax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findmax(root.left);
        int right = findmax(root.right);

        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }

        return result;
        

    }
    public static void main(String[] args) {
        FIndMax bt = new FIndMax();
         bt.createBinaryTree();
         System.out.println(bt.findmax());
    }
}
