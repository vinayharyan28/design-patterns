package structural.decorator.example;

public class DecoratorClient {
    public static void main(String[] args){
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + simpleCoffee.cost());

        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of coffee with milk: $" + coffeeWithMilk.cost());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);
        System.out.println("Cost of coffee with milk and sugar: $" + coffeeWithMilkAndSugar.cost());
    }
}
