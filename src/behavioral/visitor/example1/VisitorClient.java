package behavioral.visitor.example1;

/**
 In This example, The visitor pattern allows two different visitors (ConcreteVisitor1 and ConcreteVisitor2) to visit two different concrete elements (ConcreteElementA and ConcreteElementB)
 and perform specific operations on them without changing the element classes.
 This separation of concerns makes it easier to add new operation in the feature and keeps the code open for extension.
 */
public class VisitorClient {
    public static void main(String[] args){
        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();

        ConcreteElementA elementA = new ConcreteElementA();
        ConcreteElementB elementB = new ConcreteElementB();

        elementA.accept(visitor1);
        elementB.accept(visitor1);

        elementA.accept(visitor2);
        elementB.accept(visitor2);
    }
}
