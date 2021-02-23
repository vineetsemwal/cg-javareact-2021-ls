package streamapiex;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx2 {

    public static void main(String[] args){
        String[] strings={"one","two","three"};
        Stream<String>stream=Stream.of(strings);
        Set<String> list=stream.collect(Collectors.toSet());

        Stream<String>stream2=Stream.of("hello","bye","good","bad");
    }
}
