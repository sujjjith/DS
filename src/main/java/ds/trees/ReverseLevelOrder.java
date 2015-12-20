package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class ReverseLevelOrder {
    public void reverseLeveleOrder(TreeNode root){
        TreeNode[] queue = new TreeNode[20];
        TreeNodeStack s = new TreeNodeStack();
        int front = 0;
        int rear = 0;

        TreeNode temp;
        temp =  root;
        queue[front] = root;
        while(temp != null){
            temp = queue[front];

             if(temp != null) {
                 if (temp.getRight() != null) {
                     queue[rear] = temp.getRight();
                     rear++;
                 }
             }

            if(temp != null) {
                if(temp.getLeft() != null){
                    queue[rear] = temp.getLeft();
                    rear++;
                }
            }
            front++;
            s.push(temp);
        }
        while (!s.isEmpty()){
            System.out.println(s.pop().getData());
        }
    }
}

class TreeNodeStack{
    private final int MAX = 50;
    private int TOP = -1;

    TreeNode[] stack =  new TreeNode[MAX];

    public boolean isEmpty(){
        if(TOP == -1)
            return true;
        else
            return false;
    }

    public boolean isFull(){
        if(TOP == MAX)
            return true;
        else
            return false;
    }

    public TreeNode pop() {
        TreeNode popTreeNode = null;
        if (!isEmpty()) {
            popTreeNode = stack[TOP];
            TOP--;
        }
        return popTreeNode;
    }

    public void push(TreeNode newTreeNode){
        if(!isFull()){
            TOP = TOP + 1;
            stack[(TOP)] = newTreeNode;
        }
    }
}
