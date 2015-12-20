package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class MaximumElement {

    public int getMax(TreeNode root){
        TreeNode[] queue = new TreeNode[50];
        int front = 0;
        int rear = 0;

        int max = Integer.MIN_VALUE;

        TreeNode temp;
        temp = root;
        while(temp != null){
            int anInt = Integer.parseInt(temp.getData());
            if(anInt > max)
                max = anInt;

            if(temp.getLeft() != null){
                queue[rear] = temp.getLeft();
                rear++;
            }

            if(temp.getRight() != null){
                queue[rear] = temp.getRight();
                rear++;
            }

            front++;
            temp = queue[front - 1];
        }
        return max;
    }
}
