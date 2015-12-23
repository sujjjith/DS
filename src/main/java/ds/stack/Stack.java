package ds.stack;

/**
 * Created by skupunarapu on 12/15/2015.
 */
public class Stack {
    protected int TOP = -1;
    private static final int MAX = 10;
    protected int[] stack = new int[MAX];

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

    public int pop() {
        int popEle = 0;
        if (!isEmpty()) {
            popEle = stack[TOP];
            TOP--;
        }
        return popEle;
    }

    public void push(int ele){
        if(!isFull()){
            TOP = TOP + 1;
            stack[TOP] = ele;
        }
    }
}
