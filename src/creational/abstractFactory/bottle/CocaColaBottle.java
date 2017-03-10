package creational.abstractFactory.bottle;

import creational.abstractFactory.water.AbstractWater;

public class CocaColaBottle extends AbstractBottle {
    @Override
    public void Interact(AbstractWater water) {
        System.out.println("CocaCola Bottle " + water.toString());
    }

    @Override
    public String toString() {
        return this.getClass().toString();
    }
}
