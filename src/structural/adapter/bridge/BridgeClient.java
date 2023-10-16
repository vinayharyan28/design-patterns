package structural.adapter.bridge;

public class BridgeClient {
    public static void main(String[] args){
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstraction1 = new RefinedAbstraction(implementorA);
        Abstraction abstraction2 = new RefinedAbstraction(implementorB);

        abstraction1.operation();
        abstraction2.operation();
    }
}
