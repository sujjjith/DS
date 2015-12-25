package ds.designpattern.decorator;

/**
 * Created by skupunarapu on 12/24/2015.
 */
public class Test {
    public static void main(String[] args) {
        BasicCar b = new BasicCar();

        Car j = new JaguarCar(b);
        j.typeOfCar();

        System.out.println();
        System.out.println("***********");

        Car p = new PorscheCar(j);
        p.typeOfCar();
    }
}
