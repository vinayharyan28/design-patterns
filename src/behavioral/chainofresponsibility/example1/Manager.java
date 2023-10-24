package behavioral.chainofresponsibility.example1;

// Concrete handlers
public class Manager implements PurchaseHandler{
    private PurchaseHandler nextHandler;
    public void setNextHandler(PurchaseHandler handler){
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(PurchaseRequest request){
        if (request.getAmount() <= 5000){
            System.out.println("Manger approved the request for " + request.getAmount());
        }else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
