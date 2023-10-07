package creational.abstractfactory.example1;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowButton();
    }

    @Override
    public TextField createTextField() {
        return new WindowTextField();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowCheckBox();
    }
}
