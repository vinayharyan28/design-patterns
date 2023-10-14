package creational.prototype.example1;

public class ConcretePrototypeA implements Prototype {
    @Override
    public Prototype cloning(){
        return new ConcretePrototypeA();
    }
}
