package collections;

import java.util.Comparator;

public class IdKeyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer key1, Integer key2) {
        return key2.intValue()-key1.intValue();
    }
}
