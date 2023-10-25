package behavioral.command.example2;

public class UndoClient {
    public static void main(String[] args){
        Light livingRoomLight = new Light();
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.pressButton(livingRoomLightOn);
        remoteControl.pressUndoButton();
    }
}

