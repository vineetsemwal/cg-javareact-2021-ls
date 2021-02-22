package enumex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SortEx {

    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(1);
        SortEx example = new SortEx();
        example.sort(list, SortOrder.DESC);
        System.out.println(list);
    }

    public void sort(List<Integer> numbers, SortOrder sortOrder) {
        if (sortOrder == SortOrder.ASC) {
            numbers.sort(Integer::compare);
        } else {
            numbers.sort((num1, num2) -> num2 - num1);
        }
    }
}
