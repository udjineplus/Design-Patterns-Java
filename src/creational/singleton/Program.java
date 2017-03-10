package creational.singleton;

/**
 * Гарантия наличия только одного экземпляра объекта
 */
public class Program {
    public static void main(String[] args) {
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();

        inst1.singletonOperation();
        System.out.println(inst2.getSingletonData());
    }
}
