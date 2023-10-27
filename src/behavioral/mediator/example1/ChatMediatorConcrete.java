package behavioral.mediator.example1;
import java.util.ArrayList;
import java.util.List;

public class ChatMediatorConcrete implements ChatMediator{
    private final List<User> users;

    public ChatMediatorConcrete(){
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user){
        for (User u: users){
            if (u != user){
                u.receive(message);
            }
        }
    }

    public void addUser(User user){
        users.add(user);
    }
}
