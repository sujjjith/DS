package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class DeleteBinaryTree {
    public void delete(TreeNode root){
        if(root == null)
            return;

        delete(root.getLeft());
        delete(root.getRight());

        root = null;
    }
}
