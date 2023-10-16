package structural.adapter.bridge;

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
