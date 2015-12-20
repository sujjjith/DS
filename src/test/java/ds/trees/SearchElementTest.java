package ds.trees;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by skupunarapu on 12/20/2015.
 */
public class SearchElementTest {
    SearchElement searchElement;
    TreeNode a;
    TreeNode b;

    @Before
    public void init() {
        a = new TreeNode();
        b = new TreeNode();
        TreeNode c = new TreeNode();
        TreeNode d = new TreeNode();
        TreeNode e = new TreeNode();
        TreeNode f = new TreeNode();
        TreeNode g = new TreeNode();

        g.setData("7");
        f.setData("6");
        e.setData("5");
        d.setData("4").setLeft(f);
        c.setData("3").setRight(g);
        b.setData("2").setLeft(d).setRight(e);
        a.setData("1").setLeft(b).setRight(c);

        searchElement = new SearchElement();
    }

        @Test
    public void testGetElement() throws Exception {
            TreeNode k = new TreeNode();
            k.setData("k");
            System.out.println(searchElement.getElement(a, b));
            System.out.println(searchElement.getElement(a, k));
    }
}