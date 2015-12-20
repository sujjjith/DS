package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class LevelOrderTraversal {
    private int MAX = 30;
    private int front = 0;
    private int rear = 0;

    public void levelOrderTra(TreeNode root) {
        TreeNode[] queue = new TreeNode[MAX];
        TreeNode temp;

        temp = root;
        while (temp != null) {
            System.out.println(temp.getData());

            if (temp.getLeft() != null) {
                queue[rear] = temp.getLeft();
                rear++;
            }

            if (temp.getRight() != null) {
                queue[rear] = temp.getRight();
                rear++;
            }

            front++;
            temp = queue[front - 1];
        }
    }
}
