package creational.abstractFactory.factory;

import creational.abstractFactory.bottle.AbstractBottle;
import creational.abstractFactory.water.AbstractWater;
import creational.abstractFactory.bottle.CocaColaBottle;
import creational.abstractFactory.water.CocaColaWater;

public class CocaColaFactory extends AbstractFactory {
    @Override
    public AbstractWater createWater() {
        return new CocaColaWater();
    }

    @Override
    public AbstractBottle createBottle() {
        return new CocaColaBottle();
    }
}
