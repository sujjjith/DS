package ds.trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class LevelOrderTraversalTest {
    LevelOrderTraversal levelOrderTraversal;
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

        levelOrderTraversal = new LevelOrderTraversal();
    }

    @Test
    public void testLevelOrderTra() throws Exception {
        levelOrderTraversal.levelOrderTra(a);
    }
}