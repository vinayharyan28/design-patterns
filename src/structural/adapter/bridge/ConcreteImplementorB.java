package structural.adapter.bridge;

public class ConcreteImplementorB implements Implementor{

    @Override
    public void operationImplementation() {
        System.out.println("Concrete Implementor B");
    }
}
