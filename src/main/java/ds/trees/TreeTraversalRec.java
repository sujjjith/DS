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

