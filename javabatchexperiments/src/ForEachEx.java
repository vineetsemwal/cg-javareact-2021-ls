public class ForEachEx {

    public static void main(String[] args){
        int numbers[]={1, 2, 3};
        /*
        for(int i=0;i<numbers.length;i++){
           String element =numbers[i];
           System.out.println(element);
        }
        */
        //foreach loop
        for(int element:numbers ){
            System.out.println(element);
        }

    }
}
