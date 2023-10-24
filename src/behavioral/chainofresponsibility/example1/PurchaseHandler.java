package behavioral.chainofresponsibility.example1;

// 1. Handler interface
public interface PurchaseHandler {
    void handleRequest(PurchaseRequest request);
    void setNextHandler(PurchaseHandler handler);
}

