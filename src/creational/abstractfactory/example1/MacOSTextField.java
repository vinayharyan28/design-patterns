package creational.abstractfactory.example1;

public class MacOSTextField implements TextField{
    @Override
    public void render() {
        System.out.println("Rendering mac text field button...");
    }

    @Override
    public void onInput() {
        System.out.println("Input mac text field...");
    }
}
