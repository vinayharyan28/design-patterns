package structural.flyweight.example1;

public class Circle implements Shape{
    private final String color;
    public Circle(String color){
        this.color = color;
    }
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing a " + color + " circle with fill color " + fillColor);
    }
}
