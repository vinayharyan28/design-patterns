package creational.builder.example1;

public class ProductBuilder {
    private int attribute1;
    private String attribute2;
    public ProductBuilder setAttribute1(int attribute1){
        this.attribute1 = attribute1;
        return this;
    }

    public ProductBuilder setAttribute2(String attribute2){
        this.attribute2 = attribute2;
        return this;
    }

    public Product build(){
        return new Product(attribute1, attribute2);
    }
}
