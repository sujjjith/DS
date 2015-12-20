package ds.queue;

import ds.linkedlist.LLNode;
import ds.trees.TreeNode;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class LinkedListImplementation {
    LLNode firstNode = null;
    LLNode lastNode = null;

    public boolean isEmpty(){
        if(firstNode == null)
            return true;
        else
            return false;
    }

    public void enQueue(TreeNode tn){
        LLNode newNode = new LLNode(tn);

        if(lastNode != null)
            lastNode.setNext(newNode);

        lastNode = newNode;

        if(firstNode == null)
            firstNode = lastNode;
    }

    public TreeNode deQueue(){
        TreeNode newTreeNode = new TreeNode();
        LLNode deQueueNode = firstNode;
        firstNode = firstNode.getNext();
        return deQueueNode.getData();
    }
}

