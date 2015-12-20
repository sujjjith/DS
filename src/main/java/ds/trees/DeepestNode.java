package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class DeepestNode {
    public TreeNode deepest(TreeNode root){
        TreeNode[] queue = new TreeNode[20];
        int front = 0;
        int rear = 0;

        TreeNode temp;
        temp = root;
        while(temp != null){
            System.out.println(temp.getData());

            if(temp.getLeft() != null){
                queue[rear]  = temp.getLeft();
                rear++;
            }

            if(temp.getRight() != null){
                queue[rear]  = temp.getRight();
                rear++;
            }

            front++;
            temp = queue[front - 1];
        }
        return queue[rear-1];
    }
}
