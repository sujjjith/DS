package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class InsertAnElement {
    public void insertNewElement(TreeNode root, TreeNode eleToInsert){
        TreeNode[] queue = new TreeNode[50];
        int front = 0;
        int rear = 0;

        TreeNode temp;
        temp = root;
        while(temp != null){

            if(temp.getLeft() != null){
                queue[rear] = temp.getLeft();
                rear++;
            }else{
                temp.setLeft(eleToInsert);
                break;
            }

            if(temp.getRight() != null){
                queue[rear] = temp.getRight();
                rear++;
            }else{
                temp.setRight(eleToInsert);
                break;
            }

            front++;
            temp = queue[front - 1];
        }
    }
}
