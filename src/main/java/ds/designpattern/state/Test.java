package ds.designpattern.state;

/**
 * Created by skupunarapu on 12/27/2015.
 */
public class Test {
    public static void main(String[] args) {
        ModeContext modeContext = new ModeContext();
        modeContext.setState(new SteadyState());
        modeContext.doAction();
        modeContext.setState(new WalkState());
        modeContext.doAction();
        modeContext.setState(new StopState());
        modeContext.doAction();
        modeContext.setState(new SteadyState());
        modeContext.doAction();
        modeContext.setState(new RunState());
        modeContext.doAction();
        modeContext.setState(new StopState());
        modeContext.doAction();
    }
}
