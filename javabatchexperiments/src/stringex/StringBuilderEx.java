package stringex;

public class StringBuilderEx {
    public static void main(String args[]){
        StringBuilder str=new StringBuilder();
        for(int i=0;i<100;i++){
         str.append(i);
        }
        System.out.println(str);
    }
}
