package testsdemo.calculator;

public class Compare {

    /**
     *  if num1 > num2 return +1
     *  if num2>num1 return -1
     *  if num1 ==num2 return 0
     *
     */
    public int compare(int num1, int num2){
       if(num1>num2){
           return 1;
       }

       if(num2>num1){
           return -1;
       }

       return 0;
    }
}
