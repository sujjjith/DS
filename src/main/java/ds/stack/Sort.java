package ds.stack;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class Sort {
    public Stack sort(Stack s){
        Stack sorted = new Stack();
        while (!s.isEmpty()) {
            int tmp = s.pop();
            while(!sorted.isEmpty() && sorted.pop() > tmp){
                s.push(sorted.pop());
            }
            sorted.push(tmp);
            System.out.println(sorted.TOP);
        }
        return sorted;
    }
}
