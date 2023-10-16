package structural.adapter.bridge;

public class ConcreteImplementorA implements Implementor{

    @Override
    public void operationImplementation() {
        System.out.println("Concrete Implementor A");
    }
}
