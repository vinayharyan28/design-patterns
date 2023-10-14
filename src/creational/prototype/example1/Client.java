package creational.prototype.example1;

public class Client {
    public static void main(String[] args){
        PrototypeManager manger = new PrototypeManager();
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        ConcretePrototypeB prototypeB = new ConcretePrototypeB();

        manger.registerPrototype("A", prototypeA);
        manger.registerPrototype("B", prototypeB);

        Prototype cloneA = manger.getClone("A");
        Prototype cloneB = manger.getClone("B");

        System.out.println(cloneA);
        System.out.println(cloneB);
    }
}
