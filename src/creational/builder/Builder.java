package creational.builder;

import creational.builder.product.House;

abstract class Builder {
    public abstract void buildBasement();
    public abstract void buildStorey();
    public abstract void buildRoof();
    public abstract House getResult();
}
