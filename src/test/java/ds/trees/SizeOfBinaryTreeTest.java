package ds.trees;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class SizeOfBinaryTreeTest {
    SizeOfBinaryTree sizeOfBinaryTree;
    TreeNode a;
    TreeNode b;
    TreeNode c;
    TreeNode d;
    TreeNode e;
    TreeNode f;
    TreeNode g;

    @Before
    public void init() {
        a = new TreeNode();
        b = new TreeNode();
        c = new TreeNode();
        d = new TreeNode();
        e = new TreeNode();
        f = new TreeNode();
        g = new TreeNode();

        g.setData("7");
        f.setData("6");
        e.setData("5");
        d.setData("4").setLeft(f);
        c.setData("3").setRight(g);
        b.setData("2").setLeft(d).setRight(e);
        a.setData("1").setLeft(b).setRight(c);

        sizeOfBinaryTree = new SizeOfBinaryTree();
    }

    @Test
    public void testSize() throws Exception {
        System.out.println(sizeOfBinaryTree.size(a));
    }
}