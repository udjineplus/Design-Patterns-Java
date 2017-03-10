package creational.prototype;

/**
 * Клонирование объектов
 */
public class Program {

    public static void main(String[] args) {
        Prototype prototype = new Concrete1(1);
        Prototype clone = prototype.clone();

        prototype = new Concrete2(2);
        clone = prototype.clone();
    }

}
