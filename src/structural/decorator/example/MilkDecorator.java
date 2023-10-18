package structural.decorator.example;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }

    @Override
    public double cost(){
        return super.cost() + 0.5;
    }

}
