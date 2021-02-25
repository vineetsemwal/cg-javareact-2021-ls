package streamapiex;

import java.util.stream.Stream;

public class StreamApiEx4 {

    public static void main(String[] args){
       Stream<Integer>stream= Stream.of(10,20,30,40);
       String array[]={"hello","hi","bye", "good", "bad"};
        Stream<String>strings= Stream.of(array);
        Stream<String>limited=strings.skip(3);
    }
}
