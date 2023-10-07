package creational.abstractfactory.example1;

public class MacOSButton implements Button{
    @Override
    public void render() {
        System.out.println("Rendering mac OS button...");
    }

    @Override
    public void onClick() {
        System.out.println("Click on mac os button...");
    }
}
