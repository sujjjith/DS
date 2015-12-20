package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class NoOfLeafNodes {
    public int noOfLeafNodes(TreeNode root){
        if(root == null)
            return 0;
        else if(root.getLeft() == null && root.getRight() ==null)
            return 1;
        else
            return noOfLeafNodes(root.getLeft()) + noOfLeafNodes(root.getRight());
    }
}
