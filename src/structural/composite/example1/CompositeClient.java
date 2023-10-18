package structural.composite.example1;

public class CompositeClient {
    public static void main(String[] args) {
        Component leaf1 = new Leaf("LEAF1");
        Component leaf2 = new Leaf("LEAF2");
        Composite composite1 = new Composite("COMPOSITE1");
        Composite composite2 = new Composite("COMPOSITE2");
        composite1.add(leaf1);
        composite1.add(leaf2);
        composite2.add(composite1);

        Composite root = new Composite("ROOT");
        root.add(composite2);

        root.operation();


    }
}
