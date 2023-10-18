package structural.decorator.example;

public class SimpleCoffee implements Coffee{
    @Override
    public double cost() {
        return 2.0;
    }
}
