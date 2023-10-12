package creational.builder.example1;

public class Client {
    public static void main(String[] args){
        Product product = new ProductBuilder()
                .setAttribute1(12)
                .setAttribute2("Vinay")
                .build();

        System.out.println(product.getAttribute1());
        System.out.println(product.getAttribute2());

    }
}
