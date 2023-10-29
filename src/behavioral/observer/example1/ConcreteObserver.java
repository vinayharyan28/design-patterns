package behavioral.observer.example1;

public class ConcreteObserver implements Observer{
    private final String name;
    public ConcreteObserver(String name){
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(this.name + " received the message: " + message);
    }
}
