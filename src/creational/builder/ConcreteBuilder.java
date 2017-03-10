package creational.builder;

import creational.builder.product.Basement;
import creational.builder.product.House;
import creational.builder.product.Roof;
import creational.builder.product.Storey;

class ConcreteBuilder extends Builder {

    private House house = new House();

    @Override
    public void buildBasement() {
        house.add(new Basement());
    }

    @Override
    public void buildStorey() {
        house.add(new Storey());
    }

    @Override
    public void buildRoof() {
        house.add(new Roof());
    }

    @Override
    public House getResult() {
        return house;
    }
}
