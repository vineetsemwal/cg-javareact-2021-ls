import java.util.*;
import java.util.regex.*;

 public class Ex5{
 
 
  public static void main(String args[]){
    Ex5 example=new Ex5();
    boolean result1=example.operation("abcdhello*oworlddhsghjsd");
    boolean result2= example.operation("hello*o");
    boolean result3=example.operation("helloworld");
    System.out.println("result1="+result1+" result2="+result2+" result3="+result3);
  
  }
  
 
 public boolean operation2(String input){
 if(!input.contains("*")){
 return false;
 }
 
  String parts[]=input.split("\\*");
  String part0=parts[0]; 
  String part1=parts[1];
  System.out.println("part0="+part0);
  System.out.println("part1="+part1);
  
  return (part0.charAt(part0.length()-1)==part1.charAt(0));
 }
 
        

   public boolean operation(String str){
                if(!str.contains("*")){
                 return false;
                }  
     
		int ind = str.indexOf('*');
		int priorInd = ind-1;
		int nextInd = ind+1;
		char c1 = str.charAt(priorInd);
		char c2 = str.charAt(nextInd);
		if(c1==c2) {
			return true;
		}
		return false;


   }
 
 }

