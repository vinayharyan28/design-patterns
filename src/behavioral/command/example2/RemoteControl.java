package behavioral.command.example2;

import java.util.Stack;

public class RemoteControl {
    private final Stack<Command> commandsStack = new Stack<>();
    public void pressButton(Command command){
        command.execute();
        commandsStack.push(command);
    }

    public void pressUndoButton(){
        if (!commandsStack.isEmpty()){
            Command commandToUndo = commandsStack.pop();
            commandToUndo.undo();
        }
    }
}
