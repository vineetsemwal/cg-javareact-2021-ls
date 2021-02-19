package collections;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args){
        LinkedList<String>list=new LinkedList<>();
        list.add("mohan");
        list.add("raja");
        list.add("vijay");
        String person=list.poll();
        System.out.println(person);
        System.out.println("size="+list.size() + list);
    }
}
