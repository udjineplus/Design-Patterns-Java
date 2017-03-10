package creational.abstractFactory.factory;

import creational.abstractFactory.bottle.AbstractBottle;
import creational.abstractFactory.water.AbstractWater;

public abstract class AbstractFactory {
    public abstract AbstractWater createWater();
    public abstract AbstractBottle createBottle();
}
