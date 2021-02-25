package stringex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringEx4 {

    public static void main(String[]  args){
        String input1="hello,mumbai",input2="mumbai,delhi";
        boolean contains=input1.contains("ll");
        String parts[]=input1.split(",");

      // regex for word starting with word chars containing comma and ending at word character
       Pattern pattern= Pattern.compile("\\w*,*\\w*");
        Matcher matcher = pattern.matcher(input2);
        boolean result=matcher.matches();
        System.out.println(result);
    }
}
