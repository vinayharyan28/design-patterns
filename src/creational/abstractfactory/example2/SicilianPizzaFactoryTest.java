package creational.abstractfactory.example2;

import org.junit.Test;

public class SicilianPizzaFactoryTest {
    @Test
    public void testCreatePizza() throws Exception{
        BasePizzaFactory pizzaFactory = new SicilianPizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza("cheese");
        Pizza pepperonPizza = pizzaFactory.createPizza("pepperoni");
    }
}
