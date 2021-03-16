import java.util.*;
import java.util.stream.*;


public class Ex4StreamApi{


  public static void main(String args[]){
   Ex4StreamApi example=new Ex4StreamApi();
   List<String>list1= Stream.of("apple","orange","grapes").collect(Collectors.toList());
   List<String>list2= Stream.of("melon","apple","mango").collect(Collectors.toList());
   
   String[] result=example.operation(list1, list2); 
   Stream.of(result).forEach(System.out::println);
  
  }
  
  public String[] operation(List<String>list1 , List<String> list2){
    List<String>filtered1= list1.stream().
     filter(element->!element.toLowerCase().startsWith("a") && !element.toLowerCase().startsWith("g")).
     collect(Collectors.toList());
   
    List<String>filtered2= list2.stream().
     filter(element->!element.toLowerCase().endsWith("n") && !element.toLowerCase().endsWith("e")).
     collect(Collectors.toList());
     
     List<String>result=new ArrayList<>();
     result.addAll(filtered1);
     result.addAll(filtered2);
     String[] array= result.toArray(new String[0]);
     return array;
  }


}
