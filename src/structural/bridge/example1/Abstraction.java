package structural.bridge.example1;

public abstract class Abstraction {
    protected Implementor implementor;
    Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    abstract void operation();
}
