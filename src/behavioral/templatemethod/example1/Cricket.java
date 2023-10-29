package behavioral.templatemethod.example1;

public class Cricket extends Game{
    @Override
    public void initialize(){
        System.out.println("Cricket game initialize! start playing...");
    }

    @Override
    public void startPlay(){
        System.out.println("Cricket game started. Enjoy the game!");
    }

    @Override
    public void endPlay(){
        System.out.println("Cricket game finished.");
    }
}
