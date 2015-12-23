package ds.designpattern.decorator;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public class CarDecorator implements Car {

    protected Car c;
    public CarDecorator(Car c) {
        this.c = c;
    }

    @Override
    public void typeOfCar() {
        c.typeOfCar();
    }
}
