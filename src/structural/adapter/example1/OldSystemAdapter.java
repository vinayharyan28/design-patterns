package structural.adapter.example1;

public class OldSystemAdapter implements NewSystem{
    private final OldSystem oldSystem;
    public OldSystemAdapter(OldSystem oldSystem){
        this.oldSystem = oldSystem;
    }
    @Override
    public void newRequest() {
        oldSystem.legacyRequest();
    }
}
