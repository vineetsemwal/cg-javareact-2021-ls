package stringex;

import java.util.Random;

public class RandomString {
    public static void main( String args[]){
        RandomString demo=new RandomString();
        String length10=demo.generateId(10);
        String length5=demo.generateId(5);
        String length14=demo.generateId(14);
        System.out.println("10 length ="+length10);
        System.out.println("length 5 ="+length5);
        System.out.println("length 14="+length14);
    }

    public String generateId(int length){
        StringBuilder builder = new StringBuilder();
        for (int i=0;i<length;i++){
            Random random = new Random();
            int randomNum=random.nextInt(10);
            builder.append(randomNum);
        }
        return builder.toString();
    }
}
