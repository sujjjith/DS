package ds.designpattern.facade;

/**
 * Created by skupunarapu on 12/26/2015.
 */
public class Human {
    private Food food;
    private Foot foot;
    private Time time;

    public Human() {
        this.food = new Food();
        this.foot = new Foot();
        this.time = new Time();
    }

    public void eat(){
        food.eat();
    }

    public void walk(){
        foot.walk();
    }

    public void wasteTime(){
        time.doingTimePass();
    }
}
