package structural.bridge.example1;

public class RefinedAbstraction extends Abstraction{

    RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    void operation() {
        System.out.println("Refined abstraction - ");
        implementor.operationImplementation();
    }
}
