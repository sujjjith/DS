package ds.trees;

import ds.queue.LinkedListImplementation;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class LevelOrderTraversalWithLLQueue {

    public void levOrTra(TreeNode root){
        LinkedListImplementation q = new LinkedListImplementation();
        TreeNode temp;

        q.enQueue(root);
        while(!q.isEmpty()){
            temp = q.deQueue();
            System.out.println(temp.getData());

            if(temp.getLeft() != null)
                q.enQueue(temp.getLeft());

            if(temp.getRight() != null)
                q.enQueue(temp.getRight());
        }

    }
}
