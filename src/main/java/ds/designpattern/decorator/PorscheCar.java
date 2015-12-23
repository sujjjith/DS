package ds.designpattern.decorator;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public class PorscheCar extends CarDecorator {
    public PorscheCar(Car c) {
        super(c);
    }

    @Override
    public void typeOfCar(){
        c.typeOfCar();
        System.out.print(" + Porsche car");
    }
}
