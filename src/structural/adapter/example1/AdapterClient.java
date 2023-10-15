package structural.adapter.example1;

public class AdapterClient {
    public static void main(String[] args){
        OldSystem oldSystem = new OldSystem();
        NewSystem newSystem = new OldSystemAdapter(oldSystem);
        newSystem.newRequest();

    }
}
