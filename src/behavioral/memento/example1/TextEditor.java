package behavioral.memento.example1;

// Originator
public class TextEditor {
    private String text;
    public TextEditor(){
        this.text = "";
    }

    public void write(String text){
        this.text += text;
    }

    public String getText(){
        return this.text;
    }

    public TextMemento save(){
        return new TextMemento(this.text);
    }

    public void restore(TextMemento textMemento){
        text = textMemento.getText();
    }

}
