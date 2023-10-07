package creational.abstractfactory.example1;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public TextField createTextField() {
        return new MacOSTextField();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
