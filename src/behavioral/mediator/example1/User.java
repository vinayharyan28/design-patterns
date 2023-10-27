package behavioral.mediator.example1;

public class User {
    private final ChatMediator mediator;
    private final String name;
    public User(ChatMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public void send(String message){
        mediator.sendMessage(message, this);
    }

    public void receive(String message){
        System.out.println(name + " received: " + message);
    }
}
