package creational.builder;

// Отделяет пошаговое построение сложного объекта от его представления
// пошаговое построение сложных объектов
public class Program {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Foreman foreman = new Foreman(builder);
        foreman.construct();
        builder.getResult().sout();
    }

}
