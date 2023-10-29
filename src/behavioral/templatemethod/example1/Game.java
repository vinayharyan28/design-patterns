package behavioral.templatemethod.example1;

public abstract class Game {
    // Common steps implemented in the template method
    public void pay(){
        initialize();
        startPlay();
        endPlay();
    }

    // Abstract methods (hooks) to be implemented by subclass
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

}
