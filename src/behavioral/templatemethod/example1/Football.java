package behavioral.templatemethod.example1;

public class Football extends Game {
    @Override
    public void initialize(){
        System.out.println("Football game initialize! start playing...");
    }

    @Override
    public void startPlay(){
        System.out.println("Football game started. Enjoy the game!");
    }

    @Override
    public void endPlay(){
        System.out.println("Football game finished.");
    }
}
