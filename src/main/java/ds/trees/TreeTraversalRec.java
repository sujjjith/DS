package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class TreeTraversalRec {

    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }

    public void inOrder(TreeNode root) {
        if (root != null) {
            preOrder(root.getLeft());
            System.out.println(root.getData());
            preOrder(root.getRight());
        }
    }

    public void postOrder(TreeNode root) {
        if (root != null) {
            preOrder(root.getLeft());
            preOrder(root.getRight());
            System.out.println(root.getData());
        }
    }
}

class TreeNode{
    private String data;
    private TreeNode left;
    private TreeNode right;

    public String getData() {
        return data;
    }

    public TreeNode setData(String data) {
        this.data = data;
        return this;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode setLeft(TreeNode left) {
        this.left = left;
        return this;
    }

    public TreeNode getRight() {
        return right;
    }

    public TreeNode setRight(TreeNode right) {
        this.right = right;
        return this;
    }
}