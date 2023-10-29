package behavioral.visitor.example1;

public class ConcreteElementA implements Visitable{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
