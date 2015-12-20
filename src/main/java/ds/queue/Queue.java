package ds.queue;

/**
 * Created by skupunarapu on 12/21/2015.
 */
public class Queue {
    int[] q = new int[20];
    int front = 0;
    int rear = 0;

    public boolean isEmpty(){
        if(front == 0 && rear == 0)
            return true;
        else
            return false;
    }

    public void enqueue(int data){
        q[rear] = data;
        rear++;
    }

    public int dequeue(){
        int data = q[front - 1];
        front++;
        return data;
    }
}
