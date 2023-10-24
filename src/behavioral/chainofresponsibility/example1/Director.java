package behavioral.chainofresponsibility.example1;

public class Director implements PurchaseHandler{
    private PurchaseHandler nextHandler;
    public void setNextHandler(PurchaseHandler handler){
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(PurchaseRequest request){
        if (request.getAmount() <= 5000){
            System.out.println("Director approved the request for " + request.getAmount());
        }else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }
}
