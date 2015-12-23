package ds.stack;

import org.junit.Test;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class SortTest {

    @Test
    public void testSort() throws Exception {
        Sort sort = new Sort();
        Stack s = new Stack();
        s.push(7);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(2);
        s.push(6);
        s.push(1);
        s.push(9);
        s.push(10);
        s.push(8);

        Stack sorted = sort.sort(s);
        while(!sorted.isEmpty()) {
            System.out.println(sorted.pop());
        }
    }
}