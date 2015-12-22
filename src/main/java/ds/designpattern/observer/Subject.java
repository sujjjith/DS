package ds.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skupunarapu on 12/22/2015.
 */
public class Subject {
    private int state;
    private List<Observer> observers = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers(observers);
    }

    public void notifyAllObservers(List<Observer> observers){
        for(Observer observer : observers){
            observer.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
}
