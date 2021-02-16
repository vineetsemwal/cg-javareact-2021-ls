package java8features;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiEx2 {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(10, 5, 1, 2, 8);
        BinaryOperator<Integer>binaryOperator=(e1,e2)->e1+e2;
        Optional<Integer>optional =stream.reduce(binaryOperator);
        if (optional.isPresent()){
            int total=optional.get();
            System.out.println("total value is "+total);
        }
    }
}
