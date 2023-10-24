package behavioral.chainofresponsibility.example1;

public class Client {
    public static void main(String[] args) {
        PurchaseHandler manager = new Manager();
        PurchaseHandler director = new Director();
        PurchaseHandler ceo = new CEO();

        manager.setNextHandler(director);
        director.setNextHandler(ceo);

        PurchaseRequest request1 = new PurchaseRequest(800);
        PurchaseRequest request2 = new PurchaseRequest(8000);
        PurchaseRequest request3 = new PurchaseRequest(80000);

        manager.handleRequest(request1);
        manager.handleRequest(request2);
        manager.handleRequest(request3);

    }
}
