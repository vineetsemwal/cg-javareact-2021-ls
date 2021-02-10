package collections;
import java.util.*;

public class ListEx {

    public static void main(String args[]){
        List list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int size=list.size();
        System.out.println("size at start="+size);
        Object element=list.get(1);
        System.out.println("element at 1 index="+element);
        boolean exists=list.contains(30);
        System.out.println("30 exists="+exists);
        list.remove(2);
        exists=list.contains(30);
        System.out.println("30 exists after removal="+exists);
        for(int i=0;i<list.size();i++){
          Object iteratedElement  =list.get(i);
          int iteratedElementVal=(int)iteratedElement;
          System.out.println(iteratedElementVal);
        }

        for( Object iteratedElement:list){
            int iteratedElementVal=(int)iteratedElement;
            System.out.println(iteratedElementVal);
        }

    }
}
