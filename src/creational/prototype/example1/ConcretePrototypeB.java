package creational.prototype.example1;

public class ConcretePrototypeB implements Prototype{
    @Override
    public Prototype cloning(){
        return new ConcretePrototypeB();
    }

}
