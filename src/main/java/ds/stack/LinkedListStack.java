package ds.stack;

import ds.linkedlist.LLNode;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class LinkedListStack {
    LLNode headNode= null;

    public boolean isEmpty(){
        if(headNode == null)
            return true;
        else
            return false;
    }

    public void push(LLNode newNode){
        if(headNode == null)
            headNode = newNode;
        else
        headNode.setNext(newNode);
    }

    public LLNode pop(){
        LLNode toPop = headNode;
        headNode = headNode.getNext();
        return toPop;
    }
}
