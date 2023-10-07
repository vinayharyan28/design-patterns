package creational.abstractfactory.example2;

public class CaliforniaOilSauce implements Sauce{
    public CaliforniaOilSauce(){
        prepareSauce();
    }
    @Override
    public void prepareSauce(){
        System.out.println("Prepare california oil sauce....");
    }
}
