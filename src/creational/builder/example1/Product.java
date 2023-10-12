package creational.builder.example1;


// Define the class for the complex object you want to create.
// This class should have multiple attributes that can be configured,
// and it may also have a constructor to set the required attributes.

public class Product {
    private int attribute1;
    private String attribute2;
    public Product(int attribute1, String attribute2){
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    public int getAttribute1() {
        return attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }


    public void setAttribute1(int attribute1) {
        this.attribute1 = attribute1;
    }

    public void setAttribute2(String attribute2){
        this.attribute2 = attribute2;
    }
}
