package ds.designpattern.state;

/**
 * Created by skupunarapu on 12/27/2015.
 */
public class ModeContext implements State {

    private State state;

    public ModeContext() {
    }

    public ModeContext(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
