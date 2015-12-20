package ds.queue;


import ds.stack.Stack;

/**
 * Created by skupunarapu on 12/21/2015.
 */
public class QueueReversal {
    public Queue reverse(Queue q){
        Stack s = new Stack();
        while(!q.isEmpty())
            s.push(q.dequeue());

        while (!s.isEmpty())
            q.enqueue(s.pop());

        return q;
    }
}
