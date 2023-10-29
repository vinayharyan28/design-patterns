package behavioral.state.example1;

public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Starting the context...");
        context.setState(this);
    }
}
