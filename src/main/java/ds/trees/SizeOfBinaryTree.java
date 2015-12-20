package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class SizeOfBinaryTree {
    public int size(TreeNode root){
        if(root == null)
            return 0;
        else return 1 + size(root.getLeft()) + size(root.getRight());
    }
}
