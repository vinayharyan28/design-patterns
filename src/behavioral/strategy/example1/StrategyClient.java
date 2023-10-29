package behavioral.strategy.example1;

/**
 In this example, you can easily switch between credit card and PayPal payment methods without changing the ShoppingCart class, demonstrating the flexibility of the strategy pattern.*/
public class StrategyClient {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.setPaymentStrategy(new CreditCardPayment());
        shoppingCart.checkout(100);

        shoppingCart.setPaymentStrategy(new PayPalPayment());
        shoppingCart.checkout(200);
    }
}
