package structural.decorator;

public class ConcreteDecoratorB extends Decorator {

    public String addedState = "B";

    @Override
    public void Operation() {
        System.out.println(this.addedState);
        super.Operation();
        System.out.println(this.addedState);
    }
}
