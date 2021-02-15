package stringex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {
    public  static void main(String[] args){
        Pattern pattern=Pattern.compile("\\w*[aeiou]\\w*");//regex for word containing vowel
        String input="hello world";
        Matcher matcher=pattern.matcher(input);
        boolean matches=matcher.matches();
        System.out.println("matches="+matches);
    }
}
