package behavioral.memento.example2;

public class Originator {
    private String state;
    public void setState(String state){
        this.state = state;
    }

    public Memento saveState(){
        return new Memento(this.state);
    }

    public void restoreStateFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
