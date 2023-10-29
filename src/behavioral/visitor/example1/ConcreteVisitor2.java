package behavioral.visitor.example1;

public class ConcreteVisitor2 implements Visitor{
    @Override
    public void visit(ConcreteElementA elementA) {
        System.out.println("Visitor 2 is processing " + elementA.getClass().getSimpleName());

    }

    @Override
    public void visit(ConcreteElementB elementB) {
        System.out.println("Visitor 2 is processing " + elementB.getClass().getSimpleName());

    }
}
