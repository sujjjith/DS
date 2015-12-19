package ds.trees;

import org.junit.Before;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class TreeTraversalRecTest {

    TreeTraversalRec treeTraversalRec;
    TreeNode a;

    @Before
    public void init(){
        a = new TreeNode();
        TreeNode b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();
        TreeNode g = new TreeNode();

        g.setData("g");
        f.setData("f");
        e.setData("e");
        d.setData("d").setLeft(f);
        c.setData("c").setRight(g);
        b.setData("b").setLeft(d).setRight(e);
        a.setData("a").setLeft(b).setRight(c);

        treeTraversalRec = new TreeTraversalRec();
    }

    @org.junit.Test
    public void testPreOrder() throws Exception {
        System.out.println("PreOrder");
        treeTraversalRec.preOrder(a);
    }

    @org.junit.Test
    public void testInOrder() throws Exception {
        System.out.println("InOrder");
        treeTraversalRec.inOrder(a);
    }

    @org.junit.Test
    public void testPostOrder() throws Exception {
        System.out.println("PostOrder");
        treeTraversalRec.postOrder(a);
    }
}