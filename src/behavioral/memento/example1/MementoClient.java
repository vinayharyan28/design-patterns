package behavioral.memento.example1;

public class MementoClient {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.write("Hello, ");
        TextMemento t = textEditor.save();
        history.pushUndo(t);

        textEditor.write("World! ");
        history.pushUndo(textEditor.save());

        System.out.println("Current text: " + textEditor.getText());

        textEditor.write("Java/Python developer ");

        System.out.println("Current text: " + textEditor.getText());

        TextMemento undoMemento = history.popUndo();
        if (undoMemento != null){
            history.pushRedo(textEditor.save());
            textEditor.restore(undoMemento);
            System.out.println("After undo: " + textEditor.getText());
        }

        TextMemento redoMemento = history.popRedo();
        if (redoMemento != null){
            history.pushUndo(textEditor.save());
            textEditor.restore(redoMemento);
            System.out.println("After redo: " + textEditor.getText());
        }



    }
}
