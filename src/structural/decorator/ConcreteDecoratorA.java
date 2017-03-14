package structural.decorator;

public class ConcreteDecoratorA extends Decorator {
    private String addedState = "A";

    @Override
    public void Operation() {
        super.Operation();
        System.out.println(this.addedState);
    }
}
