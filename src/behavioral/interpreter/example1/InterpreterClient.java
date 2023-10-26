package behavioral.interpreter.example1;

public class InterpreterClient {
    public static void main(String[] args){
        Pattern pattern = new ConcatenationPattern(new LiteralPattern('a'), new LiteralPattern('c'));
        Context context = new Context("ac");
        boolean isMatch = pattern.match(context.getText());
        System.out.println("Is the text a match? " + isMatch);
    }
}
