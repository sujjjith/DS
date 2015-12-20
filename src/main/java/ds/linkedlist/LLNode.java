package ds.linkedlist;

import ds.trees.TreeNode;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class LLNode {
    private LLNode next;
    private TreeNode data;

    public LLNode(TreeNode data) {
        this.data = data;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    public TreeNode getData() {
        return data;
    }

    public void setData(TreeNode data) {
        this.data = data;
    }
}
