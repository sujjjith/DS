package ds.designpattern.facade;

/**
 * Created by skupunarapu on 12/26/2015.
 */
public class TestFacade {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.wasteTime();
        h.walk();
    }
}
