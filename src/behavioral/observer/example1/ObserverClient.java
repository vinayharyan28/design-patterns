package behavioral.observer.example1;

public class ObserverClient {
    public static void main(String[] args){
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver("Observer 1");
        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.setMessage("Hello, Observers....");
    }
}
