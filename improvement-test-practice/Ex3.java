import java.util.*;
import java.util.stream.*;


class Ex3{


  public static void main(String args[]){
   Ex3 example=new Ex3();
   List<Integer> list1=Stream.of(1,2,3,4).collect(Collectors.toList());
   List<Integer> list2=Stream.of(1,2,3,5).collect(Collectors.toList());   
   Integer array[]= example.unique(list1,list2);
   for(Object e:array){
    System.out.println(e);
   }
  
  }


  Integer [] unique(List<Integer> list1, List<Integer> list2){
    List<Integer> unique1=new ArrayList(list1);
    unique1.removeAll(list2); 
  
    List<Integer> unique2=new ArrayList(list2);
    unique2.removeAll(list1);
    
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
