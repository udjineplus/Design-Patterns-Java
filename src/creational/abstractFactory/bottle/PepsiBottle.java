package creational.abstractFactory.bottle;

import creational.abstractFactory.water.AbstractWater;

public class PepsiBottle extends AbstractBottle {
    @Override
    public void Interact(AbstractWater water) {
        System.out.println("Pepsi bottle " + water.toString());
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
