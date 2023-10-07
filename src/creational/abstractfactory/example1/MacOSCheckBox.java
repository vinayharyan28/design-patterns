package creational.abstractfactory.example1;

public class MacOSCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("Rendering mac checkbox button...");
    }

    @Override
    public void onCheck() {
        System.out.println("Click on mac checkbox button...");
    }
}
