package creational.prototype.deepandshallowcopy;

import java.util.Arrays;

public class DeepCopyExample {
    private int[] data;
    public DeepCopyExample(int[] data){
        this.data = new int[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }


}
