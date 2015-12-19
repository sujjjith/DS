package ds.trees;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class TreeTraversalNonRec {

    public void preOrder(TreeNode root){
        if(root == null)
            return;

        Stack s = new Stack();
        while(true){
            while(root != null){
                System.out.println(root.getData());
                s.push(root);
                root = root.getLeft();
            }
            if(s.isEmpty())
                break;

            root = s.pop();
            root = root.getRight();
        }
        return;
    }

    public void inOrder(TreeNode root){
        if(root == null)
            return;

        Stack s = new Stack();
        while(true){
            while(root != null){
                s.push(root);
                root = root.getLeft();
            }
            if(s.isEmpty()) {
                break;
            }

            root = s.pop();
            System.out.println(root.getData());
            root = root.getRight();
        }
        return;
    }
}

class Stack{
    int TOP = -1;
    static final int MAX = 10;
    TreeNode[] stack = new TreeNode[MAX];

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
        TreeNode popEle = null;
        if (!isEmpty()) {
            popEle = stack[TOP];
            TOP--;
        }
        return popEle;
    }

    public void push(TreeNode ele){
        if(!isFull()){
            TOP = TOP + 1;
            stack[TOP] = ele;
        }
    }
}
