package behavioral.chainofresponsibility.example1;

public class PurchaseRequest {
    private final double amount;
    public PurchaseRequest(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return this.amount;
    }
}
