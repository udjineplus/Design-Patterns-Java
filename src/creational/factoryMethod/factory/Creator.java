package creational.factoryMethod.factory;

import creational.factoryMethod.product.Product;

public abstract class Creator {
    private Product product;
    public abstract Product factoryMethod();
}
