package creational.abstractFactory;

import creational.abstractFactory.factory.CocaColaFactory;
import creational.abstractFactory.factory.PepsiFactory;

/**
 *  Интерфейс для создания взаимно связанных компонентов
 *  не специфицируя конкретных классов
 *  абстрагируя процесс инстанцирования
 *  абстрагируя варианты использования
 *  Порождение семейств взаимодействующих продуктов
 */
public class Program {
    public static void main(String[] args) {
        Client client = new Client(new CocaColaFactory());
        client.Run();
        client = new Client(new PepsiFactory());
        client.Run();
    }
}
