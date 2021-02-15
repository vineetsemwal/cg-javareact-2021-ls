package ioex.charstreamex;
import java.io.InputStream;
import java.util.*;

public class ScannerExample {

    public static void main(String args[]){
        InputStream inputStream=System.in;
        Scanner scanner = new Scanner(inputStream);
        System.out.println( "provide name");
        String name=scanner.next();
        System.out.println("provide age");
        int  age=scanner.nextInt();
        System.out.println("name is "+name+" age is "+age);
        scanner.close();

    }
}
