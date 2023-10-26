package behavioral.interpreter.example1;

public class ConcatenationPattern implements Pattern{
    private final Pattern left;
    private final Pattern right;

    public ConcatenationPattern(Pattern left, Pattern right){
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean match(String text) {
        return  left.match(text) && right.match(text.substring(1));
    }
}
