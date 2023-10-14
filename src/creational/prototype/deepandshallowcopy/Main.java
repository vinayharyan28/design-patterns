package creational.prototype.deepandshallowcopy;

public class Main {
    public static void main(String[] args) {
        int[] values = {3, 7, 9};

        System.out.println("Shallow copy.....");
        ShallowCopyExample shallowCopyExample = new ShallowCopyExample(values);
        shallowCopyExample.showData();
        values[0] = 13;
        shallowCopyExample.showData();

        System.out.println("Deep copy......");
        int[] data = {3, 4, 9};
        DeepCopyExample deepCopyExample = new DeepCopyExample(data);
        deepCopyExample.showData();
        values[0] = 22;
        deepCopyExample.showData();

    }
}
