package behavioral.memento.example1;

import java.util.ArrayList;
import java.util.List;

// Caretaker
public class History {
    private final List<TextMemento> undoHistory = new ArrayList<>();
    private final List<TextMemento> redoHistory = new ArrayList<>();

    public void pushUndo(TextMemento textMemento){
        undoHistory.add(textMemento);
    }

    public TextMemento popUndo(){
        if (undoHistory.isEmpty()){
            return null;
        }
        return undoHistory.remove(undoHistory.size() - 1);
    }

    public void pushRedo(TextMemento textMemento){
        redoHistory.add(textMemento);
    }

    public TextMemento popRedo(){
        if (redoHistory.isEmpty()){
            return null;
        }
        return redoHistory.remove(redoHistory.size() - 1);
    }

}
