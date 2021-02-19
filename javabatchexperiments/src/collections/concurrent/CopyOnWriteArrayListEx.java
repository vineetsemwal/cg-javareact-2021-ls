package collections.concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEx {
    public static void main(String args[]){
        CopyOnWriteArrayList<Integer>list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
    }
}
