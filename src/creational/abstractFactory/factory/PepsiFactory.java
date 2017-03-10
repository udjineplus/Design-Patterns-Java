package creational.abstractFactory.factory;

import creational.abstractFactory.bottle.AbstractBottle;
import creational.abstractFactory.water.AbstractWater;
import creational.abstractFactory.bottle.PepsiBottle;
import creational.abstractFactory.water.PepsiWater;

public class PepsiFactory extends AbstractFactory {
    @Override
    public AbstractWater createWater() {
        return new PepsiWater();
    }

    @Override
    public AbstractBottle createBottle() {
        return new PepsiBottle();
    }
}

