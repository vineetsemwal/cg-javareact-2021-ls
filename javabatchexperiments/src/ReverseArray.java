import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseArray {

    public static void main(String[]  args){
        int array[]={11,12,13,14,15,16};
        ReverseArray reverseArray=new ReverseArray();
        int reversed[]=reverseArray.reverse(array);
        for (int num:reversed){
            System.out.print(num+",");
        }
    }

    public  int[]   reverse(int array[]){
        List<Integer>list=new ArrayList<Integer>();
        for (int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Collections.reverse(list);
        int result[]=new int[array.length];
        for (int index=0;index<list.size();index++){
            result[index]=list.get(index);
        }
         return result;
    }
}
