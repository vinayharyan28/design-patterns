package behavioral.memento.example1;

// Memento
public class TextMemento {
    private final String text;

    public TextMemento(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }


}
