package creational.abstractfactory.example2;


public class GourmetToppingFactory extends BaseToppingFactory{
    @Override
    public void createCheese(){
        new GoatCheese();
    }

    @Override
    public void createSauce(){
        new CaliforniaOilSauce();
    }

}
