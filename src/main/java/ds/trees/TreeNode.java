package ds.trees;

public class TreeNode{
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
