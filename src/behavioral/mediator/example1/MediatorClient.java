package behavioral.mediator.example1;

public class MediatorClient {
    public static void main(String[] args){
        ChatMediatorConcrete mediator = new ChatMediatorConcrete();
        User user1 = new User(mediator, "User1");
        User user2 = new User(mediator, "User2");
        User user3 = new User(mediator, "User3");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello, everyone! ");
    }
}
