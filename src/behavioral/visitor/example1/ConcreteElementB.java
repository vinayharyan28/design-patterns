package behavioral.visitor.example1;

public class ConcreteElementB implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
