package behavioral.strategy.example1;

public class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via PayPal.");
    }
}
