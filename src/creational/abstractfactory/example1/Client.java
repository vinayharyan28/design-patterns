package creational.abstractfactory.example1;


public class Client {
    private static boolean isWindows(){
        // Check the current operating system
        // For simplicity, assume its windows here
        return true;
    }

    public static void main(String[] args) {
        GUIFactory factory;
        if (isWindows()){
            factory = new WindowsFactory();
        }else{
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        TextField textField = factory.createTextField();
        CheckBox checkBox = factory.createCheckBox();

        button.render();
        textField.render();
        checkBox.render();

        button.onClick();
        textField.onInput();
        checkBox.onCheck();
    }
}

/*
+-------------------+     +-----------------------+     +----------------------+
|    GUIFactory    |<>--- |      WindowsFactory  |<>--- |      MacOSFactory   |
+-------------------+     +-----------------------+     +----------------------+
| + createButton()  |     | + createButton()      |     | + createButton()     |
| + createTextField()|     | + createTextField()   |     | + createTextField()  |
| + createCheckbox() |     | + createCheckbox()    |     | + createCheckbox()   |
+-------------------+     +-----------------------+     +----------------------+
        |                          |                          |
        |                          |                          |
        |                          |                          |
        v                          v                          v
+-------------------+    +-------------------+    +-------------------+
|      Button       |    |    TextField     |    |     Checkbox      |
+-------------------+    +-------------------+    +-------------------+
| + render()        |    | + render()        |    | + render()        |
| + onClick()       |    | + onInput()       |    | + onCheck()       |
+-------------------+    +-------------------+    +-------------------+


GUIFactory: is an abstract class or interface that declares factory methods for creating UI elements.
WindowsFactory and MacOSFactory are concrete factories that implement GUIFactory and provide platform-specific implementations of UI elements.
Button, TextField, Checkbox are abstract classes or interfaces that declare common methods for UI elements.
WindowsButton, WindowsTextField, MacOSCheckBox are concrete classes that implement platform-specific UI elements.

The associations between the classes represent the relationships and dependencies.
for GUIFactory is associated with WindowsFactory and MacOSFactory, indicating that it can create instance of these concrete factories

Association: This is a general relationship between two or more classes or objects in which one class knows about the existence of another class
but doesn't necessarily have a specific dependency on it.
associations can be simple or complex, depending on the level of interaction between the associated classes.
*/


