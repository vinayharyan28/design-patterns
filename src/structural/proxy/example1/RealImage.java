package structural.proxy.example1;

public class RealImage implements Image{
    private final String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying image: " + filename);
    }

    private void loadFromDisk(){
        System.out.println("Loading image: " + filename);
    }

}
