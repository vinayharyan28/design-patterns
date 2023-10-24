package behavioral.chainofresponsibility.example1;

public class CEO implements PurchaseHandler{

    @Override
    public void handleRequest(PurchaseRequest request) {
        System.out.println("CEO approved the request for " + request.getAmount());
    }

    @Override
    public void setNextHandler(PurchaseHandler handler) {
        // CEO is the highest authority, so no next handler
    }
}
