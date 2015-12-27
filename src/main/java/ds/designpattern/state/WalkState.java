package ds.designpattern.state;

/**
 * Created by skupunarapu on 12/27/2015.
 */
public class WalkState implements State {
    @Override
    public void doAction() {
        System.out.println("Walking state");
    }
}
