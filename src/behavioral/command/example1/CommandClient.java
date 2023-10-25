package behavioral.command.example1;

public class CommandClient {
    public static void main(String[] args){
        Light livingRoomLight = new Light();
        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        RemoteControl remote = new RemoteControl();
        remote.setCommand(livingRoomLightOn);
        remote.pressButton();
    }
}
