package behavioral.state.example1;

public class StopStep implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Stopping the context.");
        context.setState(this);
    }
}
