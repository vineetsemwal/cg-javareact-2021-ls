package streamapiex;



import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class StreamApiEx3 {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(21,"jatin"));
        list.add(new Person(16,"mohan"));
        list.add(new Person(19,"shivender"));
        list.add(new Person(22,"abeer"));
        Stream<Person>stream=list.stream();
        Stream<Person>filtered=stream.filter((person)->person.getAge()>18);
        Comparator<Person>comparator= CustomUtiltity::compare;
        Stream<Person>sorted=filtered.sorted(comparator);
        Function<Person,String>func=(person)->person.getName();
        Stream<String>names=sorted.map(func);
        BinaryOperator<String>binaryOperator=(str1,str2)->str1+str2;
        Optional<String>optional= names.reduce(binaryOperator);
        if(optional.isPresent()){
           String value= optional.get();
           System.out.println(value);
        }
    }

}

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}