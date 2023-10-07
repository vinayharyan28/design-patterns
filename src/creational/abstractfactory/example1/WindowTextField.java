package creational.abstractfactory.example1;

public class WindowTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering window text field...");
    }

    @Override
    public void onInput() {
        System.out.println("Click on text input button...");
    }
}
