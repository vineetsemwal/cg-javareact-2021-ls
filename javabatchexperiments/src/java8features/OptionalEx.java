package java8features;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(678);
        if (optional.isPresent()) {
            int value = optional.get();
            System.out.print("value from optional is " + value);
        } else {
            System.out.println("optional is not containing value");
        }


    }
}
