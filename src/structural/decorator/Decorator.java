package structural.decorator;

public abstract class Decorator extends Component {
    private Component component;

    @Override
    public void Operation() {
        if(component != null) {
            component.Operation();
        }
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
