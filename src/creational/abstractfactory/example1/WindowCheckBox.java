package creational.abstractfactory.example1;

public class WindowCheckBox implements CheckBox {

    @Override
    public void render() {
        System.out.println("Rendering window check box...");
    }

    @Override
    public void onCheck() {
        System.out.println("Click on check button...");
    }
}
