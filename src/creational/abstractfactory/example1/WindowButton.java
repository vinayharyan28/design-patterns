package creational.abstractfactory.example1;

public class WindowButton implements Button{
   @Override
    public void render(){
       System.out.println("Rendering window button...");
    }

    @Override
    public void onClick(){
        System.out.println("Clicking on window button...");
    }

}
