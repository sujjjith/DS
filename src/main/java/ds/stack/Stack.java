package ds.stack;

/**
 * Created by skupunarapu on 12/15/2015.
 */
public class Stack {
    private int TOP = -1;
    private static final int MAX = 10;
    private int[] stack = new int[MAX];
    private int[] minStack = new int[MAX];
    private int[] maxStack = new int[MAX];

    private int MIN_STACK = Integer.MAX_VALUE;
    private int MAX_STACK = Integer.MIN_VALUE;

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

    public int pop(int[] stack) {
        int popEle = 0;
        if (!isEmpty()) {
            popEle = stack[TOP];
            TOP--;
        }
        return popEle;
    }

    public void push(int[] stack, int ele){
        if(!isFull()){
            TOP = TOP + 1;
            stack[TOP] = ele;
            if(ele < MIN_STACK)
                MIN_STACK = ele;
            else if(ele > MAX_STACK)
                MAX_STACK = ele;
        }
    }
}
