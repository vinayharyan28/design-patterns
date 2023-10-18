package structural.composite.example1;

public class Leaf implements Component{
    private final String name;
    public Leaf(String name){
        this.name = name;
    }
    @Override
    public void operation(){
        System.out.println("Leaf " + name + " Operation.");
    }
}
