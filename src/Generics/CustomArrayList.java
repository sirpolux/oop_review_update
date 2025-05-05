package Generics;

import java.util.List;

public class CustomArrayList<T extends Number> {

    private int size = 0;
    private Object[] data;
    private int DEFAULT_SIZE=10;

    public CustomArrayList(){
        data = new Object[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
    }

    public int getSize(){
        return size;
    }

    public T getItem(int index){
        return (T)this.data[index];
    }
    public T getItems2 (List<? extends Number> val){
        return null;
    }
}
