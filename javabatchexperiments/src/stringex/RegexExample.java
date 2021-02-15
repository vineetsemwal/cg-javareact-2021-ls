package stringex;

import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String args[]){
        String string="hello-world";
        String parts[]=string.split("-");
        for(String part:parts){
            System.out.println("part="+part);
        }
    }
}
