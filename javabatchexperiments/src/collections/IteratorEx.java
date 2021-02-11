package collections;

import java.util.*;
public class IteratorEx {

    public static void main(String[] args){
        List<Integer>list = new ArrayList<>();
        list.add(11);
        list.add(20);
        list.add(31);
        list.add(40);
        list.add(51);
        Iterator<Integer>iterator= list.iterator();
        while (iterator.hasNext()){
            Integer element=iterator.next();
            if(element.intValue()%2!=0){
                iterator.remove();
            }
        }
        
        System.out.println(list);
    }
}
