package creational.abstractFactory;

import creational.abstractFactory.bottle.AbstractBottle;
import creational.abstractFactory.factory.AbstractFactory;
import creational.abstractFactory.water.AbstractWater;

class Client {
    private AbstractWater water;
    private AbstractBottle bottle;

    Client(AbstractFactory factory) {
        water = factory.createWater();
        bottle = factory.createBottle();
    }

    void Run() {
        bottle.Interact(water);
    }
}
