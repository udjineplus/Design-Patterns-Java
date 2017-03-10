package creational.factoryMethod.factory;

import creational.factoryMethod.product.ConcreteProduct;
import creational.factoryMethod.product.Product;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
