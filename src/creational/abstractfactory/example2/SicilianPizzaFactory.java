package creational.abstractfactory.example2;

public class SicilianPizzaFactory extends BasePizzaFactory{
    @Override
    public Pizza createPizza(String type){
        Pizza pizza;
        BaseToppingFactory toppingFactory = new SicilianToppingFactory();
        pizza = switch (type.toLowerCase()) {
            case "cheese" -> new CheesePizza(toppingFactory);
            case "pepperoni" -> new PepperoniPizza(toppingFactory);
            case "veggie" -> new VeggiePizza(toppingFactory);
            default -> throw new IllegalArgumentException("No such pizza.");
        };

        pizza.addIngredients();
        pizza.bakePizza();
        return pizza;
    }

}
