package ds.stack;

/**
 * Created by skupunarapu on 12/15/2015.
 */
public class SpecialStack extends Stack {
    Stack minStack = new Stack();
    Stack maxStack = new Stack();

    public void push(int ele){
        if(isEmpty()){
            super.push(ele);
            minStack.push(ele);
            maxStack.push(ele);
        }else{
            if(minStack.stack[TOP] > ele){
                super.push(ele);
                minStack.push(ele);
                maxStack.push(maxStack.stack[TOP - 1]);
            }else if(maxStack.stack[TOP] < ele){
                super.push(ele);
                maxStack.push(ele);
                minStack.push(minStack.stack[TOP - 1]);
            }
        }
    }

    public int pop(){
        minStack.pop();
        maxStack.pop();
        return super.pop();
    }

    public int getMin(){
        int min = minStack.pop();
        minStack.push(min);
        return min;
    }

    public int getMax(){
        int max = maxStack.pop();
        maxStack.push(max);
        return max;
    }

    public static void main(String[] args) {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(2);
        s.push(20);
        s.push(30);
        s.push(15);
        System.out.println("Max "+s.getMax());
        System.out.println("Min "+s.getMin());
        s.push(5);
        s.push(50);
        System.out.println("Max "+s.getMax());
        System.out.println("Min "+s.getMin());
    }
}
