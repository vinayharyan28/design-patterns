package creational.abstractfactory.example2;

public class SicilianToppingFactory extends BaseToppingFactory{
    @Override
    public void createCheese(){
        new MozzarellaCheese();
    }

    @Override
    public void createSauce(){
        new TomatoSauce();
    }

}
