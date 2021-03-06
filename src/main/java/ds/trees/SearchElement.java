package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class SearchElement {
    public boolean getElement(TreeNode root, TreeNode find){
        TreeNode[] queue = new TreeNode[50];
        boolean found = false;
        int front = 0;
        int rear = 0;

        int max = Integer.MIN_VALUE;

        TreeNode temp;
        temp = root;
        while(temp != null){

            if(temp.getData() == find.getData()){
                found = true;
                break;
            }

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

        return found;
    }
}
