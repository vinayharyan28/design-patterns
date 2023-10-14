package creational.prototype.deepandshallowcopy;

import java.util.Arrays;

/*
* In object-oriented programming, object copying is creating a copy of an existing object,
* The resulting object is called an object copy or simply copy of the original object.
* There are several ways to copy an object, most commonly by a copy constructor or cloning
*
* Three ways for creating copy object.
* */
public class ShallowCopyExample {
    private int[] data;
    public ShallowCopyExample(int[] data){
        this.data = data;
    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
