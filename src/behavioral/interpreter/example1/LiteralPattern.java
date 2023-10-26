package behavioral.interpreter.example1;

public class LiteralPattern implements Pattern{
    private final char character;

    public LiteralPattern(char character){
        this.character = character;
    }

    @Override
    public boolean match(String text){
        return !text.isEmpty() && text.charAt(0) == character;
    }

}
