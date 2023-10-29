package behavioral.templatemethod.example1;
/**
 In this example, the game abstract class defines the template method play(), which call initialize(), StartPlay(), and endPlay().
 Concrete subclass like cricket and football provide their own implementation for these methods.
 The template method ensure a consistent algorithm structure, while the abstract methods allow customization for each type of game
 */
public class TemplateMethodClient {
    public static void main(String[] args){
        Game cricket = new Cricket();
        cricket.pay();

        System.out.println();

        Game football = new Football();
        football.pay();
    }
}
