package creational.factorymethod.example1;

public class SquareFactory implements ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
