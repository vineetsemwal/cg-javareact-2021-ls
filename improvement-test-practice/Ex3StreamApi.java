import java.util.*;
import java.util.stream.*;


class Ex3StreamApi{


  public static void main(String args[]){
   Ex3StreamApi example=new Ex3StreamApi();
   List<Integer> list1=Stream.of(1,2,3,4).collect(Collectors.toList());
   List<Integer> list2=Stream.of(1,2,3,5).collect(Collectors.toList());   
   Integer array[]= example.unique(list1,list2);
   for(Object e:array){
    System.out.println(e);
   }
  
  }


  Integer [] unique(List<Integer> list1, List<Integer> list2){
    List<Integer> unique1=list1.stream().
    filter(element->!list2.contains(element)).
    collect(Collectors.toList()); 
  
    List<Integer> unique2=list2.stream().
     filter(element->!list1.contains(element)).
    collect(Collectors.toList()); 
    
    List<Integer> allUniqueList=new ArrayList();
    allUniqueList.addAll(unique1);
    allUniqueList.addAll(unique2);
    
   // Integer array[]=allUniqueList.toArray(new Integer[0]);
    Integer array[]=new Integer[allUniqueList.size()];
   for(int i=0;i<allUniqueList.size();i++){
     array[i]=allUniqueList.get(i);
   }
    return array ;     
 
 }

}
