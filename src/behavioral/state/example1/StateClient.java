package behavioral.state.example1;

/**
 In this example, we have two concrete states, StartState and StopState each with its own implementation of the doAction method.
 The Context class maintains a reference to the current state and delegates the behavior to the current state .

 It demonstrates how the state of the context changes from "starting" to "stopping" based on the concrete state that is active.
 The State pattern helps keep the behavior of each state separate and allows for easy addition of new states without modifying the context.
 */
public class StateClient {
    public static void main(String[] args) {
        Context context = new Context();

        State startState = new StartState();
        startState.doAction(context);

        System.out.println("Current sate: " + context.getState());


        State stopSate = new StopStep();
        stopSate.doAction(context);

        System.out.println("Current sate: " + context.getState());

    }
}

