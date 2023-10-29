package behavioral.memento.example2;


public class Caretaker {
    private Memento memento;
    public void saveMemento(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento(){
        return this.memento;
    }
}
