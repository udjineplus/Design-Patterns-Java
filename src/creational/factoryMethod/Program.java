package creational.factoryMethod;

import creational.factoryMethod.factory.ConcreteCreator;
import creational.factoryMethod.factory.Creator;
import creational.factoryMethod.product.Product;

/**
 * Основа всех порождающих паттернов
 */
public class Program {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product = creator.factoryMethod();
    }
}
