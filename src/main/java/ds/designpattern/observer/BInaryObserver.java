package ds.designpattern.observer;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class BInaryObserver extends Observer {

    public BInaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toBinaryString(subject.getState()).toUpperCase() );
    }
}
