package structural.flyweight.example1;

public class FlyweightExample {
    public static void main(String[] args) {
        String[] colors = {
                "Green",
                "Red",
                "Green",
                "Blue",
                "Red",
                "Yellow",

        };

        for (String color: colors){
            Circle circle = (Circle) ShapeFactory.getCircle(color);
            circle.draw(color);
        }
    }
}
