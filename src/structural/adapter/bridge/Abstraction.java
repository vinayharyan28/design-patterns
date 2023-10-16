package structural.adapter.bridge;

public abstract class Abstraction {
    protected Implementor implementor;
    Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    abstract void operation();
}
